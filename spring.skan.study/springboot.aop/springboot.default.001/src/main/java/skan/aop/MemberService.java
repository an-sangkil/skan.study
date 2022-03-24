package skan.aop;

import org.springframework.stereotype.Service;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/23
 */
public interface MemberService {
    String save(String test_data);
    int delete(String data) throws Exception;
}
