/**
 * Filename:    Resetting.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2013-6-13 上午11:06:20
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2013-6-13     Robert Sun     1.0         1.0 Version
 */
package com.example.string;

//: strings/Resetting.java
import java.util.regex.*;

public class Resetting {
public static void main(String[] args) throws Exception {
  Matcher m = Pattern.compile("[frb][aiu][gx]")
    .matcher("fix the rug with bags");
  while(m.find())
	  System.out.print(m.group() + " ");
  System.out.println();
  m.reset("fix the rig with rags");
  while(m.find())
    System.out.print(m.group() + " ");
}
} /* Output:
fix rug bag
fix rig rag
*///:~
