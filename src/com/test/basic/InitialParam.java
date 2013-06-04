/**
 * Filename:    InitialParam.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-2-28 14:17:52
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-2-28     Robert Sun     1.0         1.0 Version
 */
package com.test.basic;

/**
 * Verify that Java performs default initialization.
 * @author Robert Sun
 * Create at 2012-2-28 14:17:52
 */
public final class InitialParam {

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	*/
	private InitialParam() { }

//	static int a;
//	static char c;
	/**C : 用于测试静态变量.*/
	public static final char C = 'T';
	/**
	 * You got it.
	 * @param args arguments
	 */
	public static void main(final String[] args) {
//		System.out.println(a);
		System.out.print("1");
//		System.out.print(c);
		System.out.print("1");
	}

}
