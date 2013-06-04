/**
 * Filename:    Tank.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-7-23 下午5:22:53
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-7-23     Robert Sun     1.0         1.0 Version
 */
package com.test.gc;

/**
 * <p>Title: Tank</p>
 * <p>Description: 容器，清理示例.</p>
 * @author Robert Sun
 * Create at 2012-7-23 下午5:22:53
 */
public final class Tank {

	/**content : 容器的内容.*/
	private String content;

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	 */
	private Tank() {
	}

	/**
	 * <p>Title: fill</p>
	 * <p>Description: 填满.</p>
	 * @param content void    返回类型
	*/
	private void fill(String content) {
		this.content = content;
	}

	/**
	 * <p>Title: empty</p>
	 * <p>Description: 清空.</p>
	*/
	private void empty() {
		this.content = null;
	}

	/**
	 * <p>Title: main</p>
	 * <p>Description: .</p>
	 * @param args void    返回类型
	 * @throws Throwable Throwable
	 */
	public static void main(String[] args) throws Throwable {
		Tank tank = new Tank();
		tank.fill("full");
		System.out.println(tank.content);
		try {
			tank.empty();
			System.out.println("empty");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tank.finalize();
		}
	}

	/* (非 Javadoc)
	 * <p>Title: finalize</p>
	 * <p>Description: </p>
	 * @throws Throwable
	 * @see java.lang.Object#finalize()
	*/
	@Override
	protected void finalize() throws Throwable {
		this.empty();
		System.out.println("final : empty");
	}

}
