/**
 * Filename:    testNewString.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-7-25 下午3:29:26
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-7-25     Robert Sun     1.0         1.0 Version
 */
package com.example.string;

/**
 * <p>Title: TestNewString</p>
 * <p>Description: 测试new的对象.</p>
 * @author Robert Sun
 * Create at 2012-7-25 下午3:29:26
 */
public final class TestNewString {



	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	 */
	private TestNewString() {
	}

	/**
	 * <p>Title: main</p>
	 * <p>Description: ...</p>
	 * @param args void    返回类型
	*/
	public static void main(String[] args) {
		String s = "abc";
		String s1 = new String("abc");
		String s2 = new String("a" + "b");
		String s3 = 1 + 2 + s + 3 + 4;
		String s4 = 1 + 2 + s + 3 + 4;
		String s5 = 1 + 2 + "abc" + 3 + 4;
		String s6 = 3 + "abc" + 3 + 4;
		//s引用，不建新对象，"abc" in constant pool
		System.out.println(s == "abc");
		//s1新建对象, s1 in heap
		System.out.println(s1 == s);
		//"a" + "b" 不创建新对象"a","b"，编译时直接优化成"ab" in constant pool
		System.out.println("a" + "b" == "ab");
		//s2新建对象，s2 in heap
		System.out.println(s2 == "ab");
		//1 + 2 --> 3 --> Integer(3) in heap --> String("3") in heap --> String("3abc") in heap
		//--> Integer(3) in heap --> String("3") in heap --> String("3abc3") in heap
		//--> Integer(4) in heap --> String("4") in heap --> String("3abc34") in heap
		System.out.println(s3);
		//in heap not in constant pool
		System.out.println(1 + 2 + s == 3 + s);
		//1 + 2 --> 3 --> Integer(3) in heap --> String("3") in heap --> String("3abc") in heap
		System.out.println(1 + 2 + s);
		//Integer(3) in heap --> String("3") in heap --> String("3abc") in heap
		System.out.println(3 + s);
		System.out.println(new Integer(1 + 2) == new Integer(3));
		//s is a reference, can't optimize in constant pool.
		System.out.println(s3 == s4);
		//"abc" in constant pool, so s5 and s6 in constant pool
		System.out.println(s5 == s6);
		System.out.println(s + "ab" == "abc" + "ab");
	}

}
