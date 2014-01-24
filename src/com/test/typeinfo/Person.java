/**
 * Filename:    Person.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2014年1月24日 下午1:18:57
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年1月24日     Robert Sun     1.0         1.0 Version
 */
package com.test.typeinfo;

//: typeinfo/Person.java 
//A class with a Null Object. 
import com.test.util.*; 

class Person { 
public final String first; 
public final String last; 
public final String address; 
// etc. 
public Person(String first, String last, String address){ 
 this.first = first; 
 this.last = last; 
 this.address = address; 
}  
public String toString() { 
 return "Person: " + first + " " + last + " " + address; 
} 
public static class NullPerson 
extends Person implements Null { 
 private NullPerson() { super("None", "None", "None"); } 
 public String toString() { return "NullPerson"; } 
} 
public static final Person NULL = new NullPerson(); 
} ///:~ 
