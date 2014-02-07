/**
 * Filename:    Holder1.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月6日 下午4:08:46
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月6日    Devin Sun     1.0         1.0 Version
 */
package com.example.generics;

//: generics/Holder1.java 

class Automobile {} 

public class Holder1 { 
	private Automobile a; 
	public Holder1(Automobile a) { this.a = a; } 
	Automobile get() { return a; } 
} ///:~ 
