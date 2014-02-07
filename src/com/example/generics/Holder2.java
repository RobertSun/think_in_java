/**
 * Filename:    Holder2.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月6日 下午4:27:37
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月6日    Devin Sun     1.0         1.0 Version
 */
package com.example.generics;

//: generics/Holder2.java 

public class Holder2 { 
	private Object a; 
	public Holder2(Object a) { this.a = a; } 
	public void set(Object a) { this.a = a; } 
	public Object get() { return a; } 
	public static void main(String[] args) { 
	  Holder2 h2 = new Holder2(new Automobile()); 
	  Automobile a = (Automobile)h2.get(); 
	  h2.set("Not an Automobile"); 
	  String s = (String)h2.get(); 
	  h2.set(1); // Autoboxes to Integer 
	  Integer x = (Integer)h2.get(); 
	} 
} ///:~ 
