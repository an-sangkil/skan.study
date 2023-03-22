package com.desigin.pattern.filter;

public class DebugFilter implements Filter {

  public boolean execute(String request) {
    System.out.println("request log: " + request);

    return true;
  }

}
