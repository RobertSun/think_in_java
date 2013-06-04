/**
 * Filename:    ManipulatingEmpty.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-2-29 13:49:46
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-2-29     Robert Sun     1.0         1.0 Version
 */
package com.test.basic;

//import com.test.basic.Empty;

/**
 * 操作无内容的类.
 * @author Robert Sun
 * Create at 2012-2-29 13:49:46
 */
public final class ManipulatingEmpty {

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	*/
	private ManipulatingEmpty() { }

	/**
	 * You got it.
	 * @param args arguments
	 */
	public static void main(final String[] args) {
		Empty empty = new Empty();
		System.out.print(empty);
	}
}
