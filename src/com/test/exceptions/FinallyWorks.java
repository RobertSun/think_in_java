/**
 * Filename:    FinallyWorks.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-1-8 下午6:08:56
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2013-1-8     Robert Sun     1.0         1.0 Version
 */
package com.test.exceptions;

//: exceptions/FinallyWorks.java
//The finally clause is always executed.

class ThreeException extends Exception {

	private static final long serialVersionUID = 1L;}

public class FinallyWorks {
static int count = 0;
public static void main(String[] args) {
 while(true) {
   try {
       // Post-increment is zero first time:
       if(count++ == 0)
         throw new ThreeException();
       System.out.println("No exception");
     } catch(ThreeException e) {
       System.out.println("ThreeException");
     } finally {
       System.out.println("In finally clause");
       if(count == 2) break; // out of "while"
     }
   }
 }
} /* Output:
ThreeException
In finally clause
No exception
In finally clause
*///:~