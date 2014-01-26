/**
 * Filename:    WhoCalled.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午8:37:19
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.example.exceptions;

//: exceptions/WhoCalled.java
//Programmatic access to stack trace information.

public class WhoCalled {
static void f() {
 // Generate an exception to fill in the stack trace
 try {
   throw new Exception();
 } catch (Exception e) {
   for (StackTraceElement ste : e.getStackTrace()) {
	   System.out.println(ste.getMethodName());
   }
 }
}
static void g() { f(); }
static void h() { g(); }
public static void main(String[] args) {
 f();
 System.out.println("--------------------------------");
 g();
 System.out.println("--------------------------------");
 h();
}
} /* Output:
f
main
--------------------------------
f
g
main
--------------------------------
f
g
h
main
*///:~