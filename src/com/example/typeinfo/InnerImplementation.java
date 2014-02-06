/**
 * Filename:    InnerImplementation.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月5日 下午5:44:14
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月5日    Devin Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

//: typeinfo/InnerImplementation.java 
//Private inner classes can’t hide from reflection. 
import com.example.typeinfo.interfacea.A;

class InnerA { 
	private static class C implements A { 
	 public void f() { System.out.println("public C.f()"); } 
	 public void g() { System.out.println("public C.g()"); } 
	 void u() { System.out.println("package C.u()"); } 
	 protected void v() { System.out.println("protected C.v()"); } 
	 private void w() { System.out.println("private C.w()"); } 
	}
	public static A makeA() { return new C(); } 
}    

public class InnerImplementation { 
	public static void main(String[] args) throws Exception { 
	  A a = InnerA.makeA(); 
	  a.f(); 
	  System.out.println(a.getClass().getName()); 
	  // Reflection still gets into the private class: 
	  HiddenImplementation.callHiddenMethod(a, "g"); 
	  HiddenImplementation.callHiddenMethod(a, "u"); 
	  HiddenImplementation.callHiddenMethod(a, "v"); 
	  HiddenImplementation.callHiddenMethod(a, "w"); 
	} 
} /* Output: 
public C.f() 
InnerA$C 
public C.g() 
package C.u() 
protected C.v() 
private C.w() 
*///:~ 