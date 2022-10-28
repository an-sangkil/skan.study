package com.innerclass;

public class InnerMemberTest{
  public class Foo {
    public void test() {
      System.out.println("asdasdad");
    }
  }
  
  public static void main(String args[]) {
    InnerMemberTest innerMemberTest = new InnerMemberTest();
    InnerMemberTest.Foo aaaa = innerMemberTest.new Foo();
    
    aaaa.test();
  }
}
