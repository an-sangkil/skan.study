package com.aereport.adtect.web.controller.lok;

import com.aereport.adtect.common.utils.ApplicationContextProvider;
import com.aereport.adtect.web.repository.LokRepository;
import com.aereport.adtect.web.service.lok.LokFirstDatasetService;
import com.aereport.jpa.entity.LokDomoDatasetMonthlyHistoryEntity;
import com.aereport.jpa.entity.LokDomoDatasetMonthlyManagementEntity;
import com.aereport.jpa.repository.LokDomoDatasetMonthlyHistoryJpaRepository;
import com.aereport.jpa.repository.LokDomoDatasetMonthlyManagementJpaRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021/12/06
 */
@Slf4j
public class LokMessagePool {

    private LokMessagePool() {
    }

    protected static volatile LokMessagePool INSTANCE;

    public static LokMessagePool getInstance() {
        if (INSTANCE == null) {
            synchronized (LokMessagePool.class) {
                INSTANCE = new LokMessagePool();
            }
        }
        return INSTANCE;
    }


    static final LokMessagePool.ParallelService<String> parallelService = new LokMessagePool.ParallelService<>();

    public <T> void run(T t) {

        log.trace("save process running");
        // producer data pun
        parallelService.taskCreation((String) t);
        //consumer take run
        parallelService.run();

    }

    private static class ParallelService<T> {

        private T object;
        protected final BlockingQueue<T> queue = new LinkedBlockingQueue<>();
        protected static final ExecutorService producer = Executors.newSingleThreadExecutor();
        protected static final ExecutorService consumer = Executors.newSingleThreadExecutor();

        public void taskCreation(T t) {

            LokStatus lokStatus = LokStatus.getInstance();

            producer.execute(() -> {
                String threadName = Thread.currentThread().getName();
                try {

                    String data = (String) t;
                    String[] dataAr = data.split("@@");
                    String year = dataAr[2];
                    String month = dataAr[3];
                    lokStatus.setJob(year + month);

                    queue.put(t);
                    log.debug("[{}] - producer >>>> entities = {}", threadName, t.toString());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        public void run() {

            LokRepository lokRepository = ApplicationContextProvider.getBean(LokRepository.class);
            LokFirstDatasetService lokFirstDatasetService = ApplicationContextProvider.getBean(LokFirstDatasetService.class);

            AtomicReference<String> year = new AtomicReference<>("");
            AtomicReference<String> month = new AtomicReference<>("");
            consumer.execute(() -> {
                try {

                    while (!queue.isEmpty()) {

                        String dataStr = (String) queue.take();
                        String[] dataAr = dataStr.split("@@");

                        long historyNumber = Long.parseLong(dataAr[0]);
                        long dataSetNumber = Long.parseLong(dataAr[1]);
                        year.set(dataAr[2]);
                        month.set(dataAr[3]);

                        // 2차 계산로직 호출
                        try {
                            lokFirstDatasetService.LokDomoMonthBatch(year.get(), month.get(), "reset");

                            //  history 상태 업데이트 성공
                            lokRepository.lokMonthlyManagementStatusChange("SUCCESS", dataSetNumber);
                            lokRepository.lokMonthlyHistoryStatusChange("SUCCESS", dataSetNumber, historyNumber);

                        } catch (Exception e) {
                            log.error("2차 도모데이터 재생성 에러 ", e);
                            //  history 상태 업데이트 실패
                            lokRepository.lokMonthlyManagementStatusChange("FAIL", dataSetNumber);
                            lokRepository.lokMonthlyHistoryStatusChange("FAIL", dataSetNumber, historyNumber);
                        }
                    }

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    log.debug("{}년 {} 월 의 데이터 재생성 작업이 완료되었습니다.", year.get(), month.get());
                    LokStatus lokStatus = LokStatus.getInstance();
                    lokStatus.remove(year.get() + month.get());
                }
                ;
            });
        }


        public T takeJob() {
            try {
                return (T) queue.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }

        }

        public void shutdownNow() {

            List<Runnable> producerRunnable = producer.shutdownNow();
            List<Runnable> consumerRunnable = consumer.shutdownNow();

            if (!producerRunnable.isEmpty()) {
                System.out.println("Not all tasks finished before calling close: " + producerRunnable.size());
            }
            ;
            if (!producerRunnable.isEmpty()) {
                System.out.println("Not all tasks finished before calling close: " + consumerRunnable.size());
            }

        }


    }
}

class LokStatus {
    private static volatile LokStatus INSTANCE;

    private static volatile ConcurrentMap<Object, Object> concurrentMap = new ConcurrentHashMap<>();

    private LokStatus() {
    }

    public static LokStatus getInstance() {

        if (INSTANCE == null) {
            synchronized (LokStatus.class) {
                INSTANCE = new LokStatus();
            }
        }
        return INSTANCE;
    }

    public void setJob(String jobKey) {
        concurrentMap.put(jobKey, jobKey);
    }

    public boolean containsKey(String jobKey) {
        return concurrentMap.containsKey(jobKey);
    }

    public void remove(String jobKey) {
        concurrentMap.remove(jobKey);
    }

}