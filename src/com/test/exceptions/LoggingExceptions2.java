/**
 * Filename:    LoggingExceptions2.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午8:05:39
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.test.exceptions;

//: exceptions/LoggingExceptions2.java
//Logging caught exceptions.
import java.util.logging.*;
import java.io.*;

public class LoggingExceptions2 {
private static Logger logger =
 Logger.getLogger("LoggingExceptions2");
static void logException(Exception e) {
 StringWriter trace = new StringWriter();
 e.printStackTrace(new PrintWriter(trace));
 logger.severe(trace.toString());
}
public static void main(String[] args) {
 try {
   throw new NullPointerException();
 } catch (NullPointerException e) {
   logException(e);
 }
}
} /* Output: (90% match)
Aug 30, 2005 4:07:54 PM LoggingExceptions2 logException
SEVERE: java.lang.NullPointerException
     at LoggingExceptions2.main(LoggingExceptions2.java:16)
*///:~