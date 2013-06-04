/**
 * Filename:    SubMethod.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-2-29 14:10:02
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-2-29     Robert Sun     1.0         1.0 Version
 */
package com.test.basic;

/**
 * 练习子方法.
 * @author Robert Sun
 * Create at 2012-2-29 14:10:02
 */
public final class SubMethod {

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	*/
	private SubMethod() { }

	/**
	 * You got it.
	 * @param args arguments
	 */
	public static void main(final String[] args) {
		String test = "TEST";
		System.out.print(storage(test));
	}

	/**
	 * 计算传入字符串长度的2倍.
	 * @param s 字符串
	 * @return int 传入字符串长度的2倍
	*/
	private static int storage(final String s) {
		  return s.length() * 2;
	}
}
