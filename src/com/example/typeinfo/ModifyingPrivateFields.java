/**
 * Filename:    ModifyingPrivateFields.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月5日 下午5:52:53
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月5日    Devin Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

//: typeinfo/ModifyingPrivateFields.java 
import java.lang.reflect.*; 

class WithPrivateFinalField { 
private int i = 1; 
private final String s = "I’m totally safe"; 
private String s2 = "Am I safe?"; 
public String toString() { 
  return "i = " + i + ", " + s + ", " + s2; 
} 
} 

public class ModifyingPrivateFields { 
public static void main(String[] args) throws Exception { 
  WithPrivateFinalField pf = new WithPrivateFinalField(); 
  System.out.println(pf); 
  Field f = pf.getClass().getDeclaredField("i"); 
  f.setAccessible(true); 
  System.out.println("f.getInt(pf): " + f.getInt(pf)); 
  f.setInt(pf, 47); 
  System.out.println(pf); 
  f = pf.getClass().getDeclaredField("s"); 
  f.setAccessible(true); 
  System.out.println("f.get(pf): " + f.get(pf)); 
  f.set(pf, "No, you’re not!"); 
  System.out.println(pf); 
  f = pf.getClass().getDeclaredField("s2"); 
  f.setAccessible(true); 
  System.out.println("f.get(pf): " + f.get(pf)); 
  f.set(pf, "No, you’re not!"); 
  System.out.println(pf); 
} 
} /* Output: 
i = 1, I’m totally safe, Am I safe? 
f.getInt(pf): 1 
i = 47, I’m totally safe, Am I safe? 
f.get(pf): I’m totally safe 
i = 47, I’m totally safe, Am I safe? 
f.get(pf): Am I safe? 
i = 47, I’m totally safe, No, you’re not! 
*///:~ 
