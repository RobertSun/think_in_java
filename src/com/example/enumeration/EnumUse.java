/**
 * Filename:    EnumUse.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-9-21 下午2:40:20
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-9-21     Robert Sun     1.0         1.0 Version
 */
package com.example.enumeration;

/**
 * <p>Title: EnumUse</p>
 * <p>Description: 枚举应用.</p>
 * @author Robert Sun
 * Create at 2012-9-21 下午2:40:20
 */
public final class EnumUse {


	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	 */
	private EnumUse() {
		super();
	}

	/**
	 * <p>Title: main</p>
	 * <p>Description: You got it.</p>
	 * @param args void    返回类型
	 */
	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MILD;
		System.out.println(howHot);
	}

}
