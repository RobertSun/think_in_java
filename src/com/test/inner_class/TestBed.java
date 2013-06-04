/**
 * Filename:    TestBed.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-18 下午6:59:51
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-18     Robert Sun     1.0         1.0 Version
 */
package com.test.inner_class;

/**
 * <p>Title: TestBed</p>
 * <p>Description: 嵌入类测试.</p>
 * @author Robert Sun
 * Create at 2012-12-18 下午6:59:51
 */
//: innerclasses/TestBed.java
//Putting test code in a nested class.
//{main: TestBed$Tester}

public class TestBed {
	public void f() { System.out.println("f()"); }

	/**
	* <p>Title: Tester</p>
	* <p>Description: 用于测试的嵌入类.</p>
	* @author Robert Sun
	* Create at 2012-12-18 下午7:00:27
	*/
	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
} /* Output:
f()
*///:~
