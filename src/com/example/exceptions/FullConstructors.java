/**
 * Filename:    FullConstructors.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午7:56:41
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.example.exceptions;

//: exceptions/FullConstructors.java

class MyException extends Exception {
	private static final long serialVersionUID = 1L;
public MyException() { }
public MyException(String msg) { super(msg); }
}

public class FullConstructors {
public static void f() throws MyException {
  System.out.println("Throwing MyException from f()");
  throw new MyException();
}
public static void g() throws MyException {
  System.out.println("Throwing MyException from g()");
  throw new MyException("Originated in g()");
}
public static void main(String[] args) {
  try {
    f();
  } catch (MyException e) {
    e.printStackTrace(System.out);
  }
  try {
    g();
  } catch (MyException e) {
    e.printStackTrace(System.out);
  }
}
} /* Output:
Throwing MyException from f()
MyException
      at FullConstructors.f(FullConstructors.java:11)
      at FullConstructors.main(FullConstructors.java:19)
Throwing MyException from g()
MyException: Originated in g()
      at FullConstructors.g(FullConstructors.java:15)
      at FullConstructors.main(FullConstructors.java:24)
*///:~