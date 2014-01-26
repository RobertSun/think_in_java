/**
 * Filename:    MultipleReturns.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-1-8 下午6:27:31
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2013-1-8     Robert Sun     1.0         1.0 Version
 */
package com.example.exceptions;

//: exceptions/MultipleReturns.java

public class MultipleReturns {
public static void f(int i) {
  System.out.println("Initialization that requires cleanup");
  try {
	  System.out.println("Point 1");
      if(i == 1) return;
      System.out.println("Point 2");
      if(i == 2) return;
      System.out.println("Point 3");
      if(i == 3) return;
      System.out.println("End");
      return;
    } finally {
    	System.out.println("Performing cleanup");
    }
  }
  public static void main(String[] args) {
    for(int i = 1; i <= 4; i++)
      f(i);
  }
} /* Output:
Initialization that requires cleanup
Point 1
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
End
Performing cleanup
*///:~
