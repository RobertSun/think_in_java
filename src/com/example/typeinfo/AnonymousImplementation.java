/**
 * Filename:    AnonymousImplementation.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月5日 下午5:47:04
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月5日    Devin Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

//: typeinfo/AnonymousImplementation.java 
//Anonymous inner classes can’t hide from reflection. 
import com.example.typeinfo.interfacea.A;

class AnonymousA { 
	public static A makeA() { 
	 return new A() { 
	   public void f() { System.out.println("public C.f()"); } 
	   public void g() { System.out.println("public C.g()"); } 
	   void u() { System.out.println("package C.u()"); } 
	   protected void v() { System.out.println("protected C.v()"); } 
	   private void w() { System.out.println("private C.w()"); } 
	 }; 
	} 
}    

public class AnonymousImplementation { 
	public static void main(String[] args) throws Exception { 
	 A a = AnonymousA.makeA(); 
	 a.f(); 
	 System.out.println(a.getClass().getName()); 
	 // Reflection still gets into the anonymous class: 
	 HiddenImplementation.callHiddenMethod(a, "g"); 
	 HiddenImplementation.callHiddenMethod(a, "u"); 
	 HiddenImplementation.callHiddenMethod(a, "v"); 
	 HiddenImplementation.callHiddenMethod(a, "w"); 
	} 
} /* Output: 
public C.f() 
AnonymousA$1 
public C.g() 
package C.u() 
protected C.v() 
private C.w() 
*///:~ 
