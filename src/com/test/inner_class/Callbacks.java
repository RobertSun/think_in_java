/**
 * Filename:    Callbacks.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-19 下午7:32:56
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-19     Robert Sun     1.0         1.0 Version
 */
package com.test.inner_class;

//: innerclasses/Callbacks.java
//Using inner classes for callbacks

/**
* <p>Title: Incrementable</p>
* <p>Description: 增量接口.</p>
* @author Robert Sun
* Create at 2012-12-19 下午7:34:32
*/
interface Incrementable {
	void increment();
}

//Very simple to just implement the interface:
/**
* <p>Title: Callee1</p>
* <p>Description: Very simple to just implement the interface.</p>
* @author Robert Sun
* Create at 2012-12-19 下午7:35:08
*/
class Callee1 implements Incrementable {
	private int i = 0;
	public void increment() {
		i++;
		System.out.println(i);
	}
}

/**
* <p>Title: MyIncrement</p>
* <p>Description: 我的增量.</p>
* @author Robert Sun
* Create at 2012-12-19 下午7:35:48
*/
class MyIncrement {
	public void increment() { System.out.println("Other operation"); }
	static void f(MyIncrement mi) { mi.increment(); }
}

//If your class must implement increment() in
//some other way, you must use an inner class:
/**
* <p>Title: Callee2</p>
* <p>Description: .</p>
* @author Robert Sun
* Create at 2012-12-19 下午7:36:47
*/
class Callee2 extends MyIncrement {
	private int i = 0;
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}

	/**
	* <p>Title: Closure</p>
	* <p>Description: 增量接口的另一个实现.</p>
	* @author Robert Sun
	* Create at 2012-12-19 下午7:37:10
	*/
	private class Closure implements Incrementable {
		public void increment() {
			// Specify outer-class method, otherwise
			// you’d get an infinite recursion:
			Callee2.this.increment();
		}
	}

	Incrementable getCallbackReference() {
		return new Closure();
	}
}

/**
* <p>Title: Caller</p>
* <p>Description: 回调.</p>
* @author Robert Sun
* Create at 2012-12-19 下午7:38:14
*/
class Caller {
	private Incrementable callbackReference;
	Caller(Incrementable cbh) { callbackReference = cbh; }
	void go() { callbackReference.increment(); }
}

/**
* <p>Title: Callbacks</p>
* <p>Description: 测试回调.</p>
* @author Robert Sun
* Create at 2012-12-19 下午7:38:33
*/
public final class Callbacks {

	/**
	 * <p>Title: .</p>
	 * <p>Description: </p>
	 */
	private Callbacks() { }

	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
	    Caller caller2 = new Caller(c2.getCallbackReference());
	    caller1.go();
	    caller1.go();
	    caller2.go();
	    caller2.go();
	}
} /* Output:
Other operation
1
1
2
Other operation
2
Other operation
3
*///:~