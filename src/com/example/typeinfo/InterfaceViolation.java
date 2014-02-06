/**
 * Filename:    InterfaceViolation.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2014年1月26日 下午3:41:55
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年1月26日     Robert Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

//: typeinfo/InterfaceViolation.java 
//Sneaking around an interface. 
import com.example.typeinfo.interfacea.*; 

class B implements A { 
	public void f() {} 
	public void g() {} 
} 

public class InterfaceViolation { 
	public static void main(String[] args) { 
	 A a = new B(); 
	 a.f(); 
	 // a.g(); // Compile error 
	 System.out.println(a.getClass().getName()); 
	 if(a instanceof B) { 
	   B b = (B)a; 
	   b.g(); 
	 } 
	} 
} /* Output: 
B 
*///:~ 
