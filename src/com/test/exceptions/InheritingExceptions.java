/**
 * Filename:    InheritingExceptions.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午7:54:25
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.test.exceptions;

//: exceptions/InheritingExceptions.java
//Creating your own exceptions.

class SimpleException extends Exception {

	private static final long serialVersionUID = 1L; }

public class InheritingExceptions {
public void f() throws SimpleException {
 System.out.println("Throw SimpleException from f()");
 throw new SimpleException();
}
public static void main(String[] args) {
 InheritingExceptions sed = new InheritingExceptions();
 try {
   sed.f();
 } catch (SimpleException e) {
   System.out.println("Caught it!");
 }
}
} /* Output:
Throw SimpleException from f()
Caught it!
*///:~
