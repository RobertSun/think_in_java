/**
 * Filename:    Robot.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2014年1月24日 下午3:03:56
 * 
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------  
 * 2014年1月24日     Robert Sun     1.0         1.0 Version
 */
package com.example.typeinfo;

//: typeinfo/Robot.java 
import java.util.*; 

import com.example.util.*;

public interface Robot { 
	String name(); 
	String model(); 
	List<Operation> operations(); 
	class Test { 
		public static void test(Robot r) { 
			if(r instanceof Null) 
				System.out.println("[Null Robot]"); 
    		System.out.println("Robot name: " + r.name()); 
    		System.out.println("Robot model: " + r.model()); 
    		for(Operation operation : r.operations()) { 
    			System.out.println(operation.description()); 
    			operation.command(); 
    		} 
		} 
	} 
} ///:~ 