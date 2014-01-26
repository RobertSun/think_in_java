package com.example.map;
/**
 * Filename:    HashTest.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-2-23 10:02:53
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-2-23    Robert Sun     1.0         1.0 Version
 */


import java.util.HashMap;
import java.util.Map;

/**
 * 练习HashMap.
 * @author Robert Sun
 * Create at 2012-2-23 10:02:54
 */
public final class HashTest {

	/**
	 * <p>Title: HashTest.</p>
	 * <p>Description: </p>
	*/
	private HashTest() {
	}

	/**
	 * You got it.
	 * @param args arguments
	 */
	public static void main(final String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("What", "sdc");
		map.put("is", "sdc");
	}

}
