/**
 * Filename:    TestRegularExpression.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-6-4 下午4:59:48
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2013-6-4     Robert Sun     1.0         1.0 Version
 */
package com.example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>Title: TestRegularExpression</p>
 * <p>Description: 测试正则表达式</p>
 * @author Robert Sun
 * Create at 2013-6-4 下午4:59:48
 */
public class TestRegularExpression {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage:\njava TestRegularExpression "
					+ "characterSequence regularExpression+");
			System.exit(0);
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for (String arg : args) {
			System.out.println("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while (m.find()) {
				System.out.println("Match \"" + m.group() + "\" at positions "
						+ m.start() + "-" + (m.end() - 1));
			}
		}
	}
}
