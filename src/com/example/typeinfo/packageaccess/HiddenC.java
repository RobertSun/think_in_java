/**
 * Filename:    HiddenC.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     Enraynet(Dalian) I.T. Limited Company
 * @author:     Devin Sun
 * @version:    1.0
 * Create at:   2014年2月5日 下午5:23:13
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年2月5日    Devin Sun     1.0         1.0 Version
 */
package com.example.typeinfo.packageaccess;

import com.example.typeinfo.interfacea.A;

class C implements A { 
  public void f() { System.out.println("public C.f()"); } 
  public void g() { System.out.println("public C.g()"); } 
  void u() { System.out.println("package C.u()"); } 
  protected void v() { System.out.println("protected C.v()"); } 
  private void w() { System.out.println("private C.w()"); } 
} 
 
public class HiddenC { 
  public static A makeA() { return new C(); } 
} ///:~ 
