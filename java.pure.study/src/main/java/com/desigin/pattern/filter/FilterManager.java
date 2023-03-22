package com.desigin.pattern.filter;

import java.util.Map;


/**
 * <pre>
 * Description :
 * @author skan
 * @since 2018.05.02
 * @version
 *
 * Copyright (C) 2018 by CJENM|Mezzimedia.Inc. All right reserved.
 */
public class FilterManager {
  FilterChain filterChain;

  public FilterManager(Target target){
     filterChain = new FilterChain();
     filterChain.setTarget(target);
  }
  public void setFilter(Filter filter){
     filterChain.addFilter(filter);
  }

  public void filterRequest(String request){
     filterChain.execute(request);
  }
}
