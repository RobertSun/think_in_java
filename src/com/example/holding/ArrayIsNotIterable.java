/**
 * Filename:    ArrayIsNotIterable.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-25 下午6:49:27
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-25     Robert Sun     1.0         1.0 Version
 */
package com.example.holding;

//: holding/ArrayIsNotIterable.java
import java.util.Arrays;

public final class ArrayIsNotIterable {

	private ArrayIsNotIterable() { }

static <T> void test(Iterable<T> ib) {
  for (T t : ib) {
	  System.out.print(t + " ");
  }
}
public static void main(String[] args) {
  test(Arrays.asList(1, 2, 3));
  String[] strings = {"A", "B", "C" };
  // An array works in foreach, but it’s not Iterable:
  //! test(strings);
  // You must explicitly convert it to an Iterable:
  test(Arrays.asList(strings));
}
} /* Output:
1 2 3 A B C
*///:~
