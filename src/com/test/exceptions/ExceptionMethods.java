/**
 * Filename:    ExceptionMethods.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午8:33:21
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.test.exceptions;

//: exceptions/ExceptionMethods.java
//Demonstrating the Exception Methods.

public class ExceptionMethods {
  public static void main(String[] args) {
    try {
      throw new Exception("My Exception");
    } catch (Exception e) {
    	System.out.println("Caught Exception");
    	System.out.println("getMessage():" + e.getMessage());
    	System.out.println("getLocalizedMessage():" +
        e.getLocalizedMessage());
    	System.out.println("toString():" + e);
    	System.out.println("printStackTrace():");
    	e.printStackTrace(System.out);
    }
  }
} /* Output:
Caught Exception
getMessage():My Exception
getLocalizedMessage():My Exception
toString():java.lang.Exception: My Exception
printStackTrace():
java.lang.Exception: My Exception
        at ExceptionMethods.main(ExceptionMethods.java:8)
*///:~