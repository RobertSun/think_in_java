/**
 * Filename:    EnvironmentVariables.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-25 下午6:44:56
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-25     Robert Sun     1.0         1.0 Version
 */
package com.test.holding;

//: holding/EnvironmentVariables.java
import java.util.Map;

public final class EnvironmentVariables {

	private EnvironmentVariables() { }
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
  for (Map.Entry entry: System.getenv().entrySet()) {
    System.out.println(entry.getKey() + ": "
    		+ entry.getValue());
  }
}
} /* (Execute to see output) *///:~
