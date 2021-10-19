package com.desigin.pattern.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * Description :
 * 
 * @author skan
 * @since 2018.05.02
 * @version
 *
 *          Copyright (C) 2018 by CJENM|Mezzimedia.Inc. All right reserved.
 */
public class FilterChain<T> {

  private List<Filter> filters = new ArrayList<>();
  private Target target;
  private Class<?> cls;

  public void addFilter(Filter filter) {
    filters.add(filter);
  }
  
  public void setTarget(Target target){
    this.target = target;
 }
  


  /**
   * Filter 순차 실행
   *
   * 최종 execute , request handler
   * 
   * @param httpRequest
   * @param requestData
   * @throws Exception
   */
  public void execute(String data) {

    // 1. 필터 전차리 순차 실행
    for (Filter filter : filters) {
      boolean preBoolean = filter.execute(data);
      if (!preBoolean) {
        throw new RuntimeException(" Filter execute : ");
      }
    }
    
    target.execute(data);
  }
  
}
