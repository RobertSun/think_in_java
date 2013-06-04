/**
 * Filename:    FinalizeEG.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-7-23 下午5:10:27
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-7-23     Robert Sun     1.0         1.0 Version
 */
package com.test.gc;

/**
 * <p>Title: FinalizeEG</p>
 * <p>Description: finalize示例.</p>
 * @author Robert Sun
 * Create at 2012-7-23 下午5:10:27
 */
public final class FinalizeEG {

	/**msg : 消息.*/
	private String msg;

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	 * @param msg message
	 */
	private FinalizeEG(String msg) {
		this.msg = msg;
	}

	/**
	 * <p>Title: main</p>
	 * <p>Description: .</p>
	 * @param args void    返回类型
	 * @throws Throwable Throwable
	 */
	public static void main(final String[] args) throws Throwable {
		FinalizeEG eg = new FinalizeEG("die");
		System.out.println(eg.msg);
		try {
			eg.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			eg.finalize();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("final: " + this.msg);
	}
}
