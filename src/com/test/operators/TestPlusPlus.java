/**
 * Filename:    TestPlusPlus.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-8-2 上午9:25:07
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-8-2     Robert Sun     1.0         1.0 Version
 */
package com.test.operators;

/**
 * <p>Title: TestPlusPlus</p>
 * <p>Description: 测试++运算符.</p>
 * @author Robert Sun
 * Create at 2012-8-2 上午9:25:07
 */
public class TestPlusPlus {

	/**i : i.*/
	private int i = 10;

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	 */
	public TestPlusPlus() {
		super();
	}

	/**
	 * <p>Title: main</p>
	 * <p>Description: .</p>
	 * @param args void    返回类型
	 */
	public static void main(String[] args) {
		int i = 10;
		i = i++ + i++;
		System.out.println(i);
		System.out.println(++i + ++i);
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

}
