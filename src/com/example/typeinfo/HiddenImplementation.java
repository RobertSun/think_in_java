/**
 * Filename:    HiddenImplementation.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月5日 下午5:33:28
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月5日    Devin Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

import java.lang.reflect.Method;

import com.example.typeinfo.interfacea.A;
import com.example.typeinfo.packageaccess.HiddenC;

public class HiddenImplementation { 
  public static void main(String[] args) throws Exception { 
    A a = HiddenC.makeA(); 
    a.f(); 
    System.out.println(a.getClass().getName()); 
    // Compile error: cannot find symbol ‘C’: 
    /* if(a instanceof C) { 
      C c = (C)a; 
      c.g(); 
    } */ 
    // Oops! Reflection still allows us to call g(): 
    callHiddenMethod(a, "g"); 
    // And even methods that are less accessible! 
    callHiddenMethod(a, "u"); 
    callHiddenMethod(a, "v"); 
    callHiddenMethod(a, "w"); 
  } 
  static void callHiddenMethod(Object a, String methodName) 
  throws Exception { 
    Method g = a.getClass().getDeclaredMethod(methodName); 
    g.setAccessible(true); 
    g.invoke(a); 
  } 
} /* Output: 
public C.f() 
typeinfo.packageaccess.C 
public C.g() 
package C.u() 
protected C.v() 
private C.w() 
*///:~ 
