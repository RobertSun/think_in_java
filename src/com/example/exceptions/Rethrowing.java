/**
 * Filename:    Rethrowing.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午8:45:06
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.example.exceptions;

//: exceptions/Rethrowing.java
//Demonstrating fillInStackTrace()

public class Rethrowing {
public static void f() throws Exception {
 System.out.println("originating the exception in f()");
 throw new Exception("thrown from f()");
}
public static void g() throws Exception {
 try {
   f();
 } catch (Exception e) {
   System.out.println("Inside g(),e.printStackTrace()");
   e.printStackTrace(System.out);
   throw e;
 }
}
public static void h() throws Exception {
   try {
	      f();
	    } catch (Exception e) {
	      System.out.println("Inside h(),e.printStackTrace()");
      e.printStackTrace(System.out);
      throw (Exception) e.fillInStackTrace();
    }
  }
  public static void main(String[] args) {
    try {
      g();
    } catch (Exception e) {
      System.out.println("main: printStackTrace()");
  e.printStackTrace(System.out);
}
try {
  h();
} catch (Exception e) {
  System.out.println("main: printStackTrace()");
      e.printStackTrace(System.out);
    }
  }
} /* Output:
originating the exception in f()
Inside g(),e.printStackTrace()
java.lang.Exception: thrown from f()
        at Rethrowing.f(Rethrowing.java:7)
        at Rethrowing.g(Rethrowing.java:11)
        at Rethrowing.main(Rethrowing.java:29)
main: printStackTrace()
java.lang.Exception: thrown from f()
        at Rethrowing.f(Rethrowing.java:7)
        at Rethrowing.g(Rethrowing.java:11)
        at Rethrowing.main(Rethrowing.java:29)
originating the exception in f()
Inside h(),e.printStackTrace()
java.lang.Exception: thrown from f()
        at Rethrowing.f(Rethrowing.java:7)
        at Rethrowing.h(Rethrowing.java:20)
        at Rethrowing.main(Rethrowing.java:35)
main: printStackTrace()
java.lang.Exception: thrown from f()
        at Rethrowing.h(Rethrowing.java:24)
        at Rethrowing.main(Rethrowing.java:35)
*///:~