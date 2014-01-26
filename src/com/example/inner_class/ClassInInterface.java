/**
 * Filename:    ClassInInterface.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-18 下午6:49:35
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-18     Robert Sun     1.0         1.0 Version
 */
package com.example.inner_class;

/**
 * <p>Title: ClassInInterface.</p>
 * <p>Description: 测试接口中的嵌入类.</p>
 * @author Robert Sun
 * Create at 2012-12-18 下午6:49:35
 */
//: innerclasses/ClassInInterface.java
//{main: ClassInInterface$Test}
public interface ClassInInterface {

  void howdy();

  /**
   * <p>Title: Test</p>
   * <p>Description: nested class in interface.</p>
   * @author Robert Sun
   * Create at 2012-12-18 下午6:51:05
   */
  class Test implements ClassInInterface {
    public void howdy() {
      System.out.println("Howdy!");
    }
    public static void main(String[] args) {
      new Test().howdy();
    }
  }

}
/* Output:
Howdy!
*///:~
