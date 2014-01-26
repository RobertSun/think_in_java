/**
 * Filename:    LostMessage.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-1-8 下午6:31:46
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2013-1-8     Robert Sun     1.0         1.0 Version
 */
package com.example.exceptions;

//: exceptions/LostMessage.java
//How an exception can be lost.

class VeryImportantException extends Exception {
	private static final long serialVersionUID = -6265800651731600431L;

	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {

	private static final long serialVersionUID = -4770045535222113380L;

	public String toString() {
		return "A trivial exception";
	}
}

public class LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dispose() throws HoHumException {
    throw new HoHumException();
  }
  public static void main(String[] args) {
    try {
      LostMessage lm = new LostMessage();
      try {
        lm.f();
      } finally {
        lm.dispose();
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }
} /* Output:
A trivial exception
*///:~
