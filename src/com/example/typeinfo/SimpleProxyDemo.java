/**
 * Filename:    SimpleProxyDemo.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Ӣ���������Ϣ���޹�˾
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-11-22 ����11:05:25
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2013-11-22     Robert Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

//: typeinfo/SimpleProxyDemo.java 

interface Interface { 
  void doSomething(); 
  void somethingElse(String arg); 
} 

class RealObject implements Interface { 
  public void doSomething() { System.out.println("doSomething"); } 
  public void somethingElse(String arg) { 
	System.out.println("somethingElse " + arg); 
  } 
}    
 
class SimpleProxy implements Interface { 
  private Interface proxied; 
  public SimpleProxy(Interface proxied) { 
    this.proxied = proxied; 
  } 
  public void doSomething() { 
	System.out.println("SimpleProxy doSomething"); 
    proxied.doSomething(); 
  } 
  public void somethingElse(String arg) { 
	System.out.println("SimpleProxy somethingElse " + arg); 
    proxied.somethingElse(arg); 
  } 
}    
 
class SimpleProxyDemo { 
  public static void consumer(Interface iface) { 
    iface.doSomething(); 
    iface.somethingElse("bonobo"); 
  } 
  public static void main(String[] args) { 
    consumer(new RealObject()); 
    consumer(new SimpleProxy(new RealObject())); 
  } 
} /* Output: 
doSomething 
somethingElse bonobo 
SimpleProxy doSomething 
doSomething 
SimpleProxy somethingElse bonobo 
somethingElse bonobo 
*///:~ 