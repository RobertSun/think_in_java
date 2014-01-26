/**
 * Filename:    LoggingExceptions.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-26 下午8:00:47
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-26     Robert Sun     1.0         1.0 Version
 */
package com.example.exceptions;

//: exceptions/LoggingExceptions.java
//An exception that reports through a Logger.
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
	private static final long serialVersionUID = 1L;
private static Logger logger =
 Logger.getLogger("LoggingException");
public LoggingException() {
 StringWriter trace = new StringWriter();
 printStackTrace(new PrintWriter(trace));
 logger.severe(trace.toString());
}
}

public class LoggingExceptions {
public static void main(String[] args) {
 try {
   throw new LoggingException();
 } catch (LoggingException e) {
   System.err.println("Caught " + e);
 }
 try {
   throw new LoggingException();
 } catch (LoggingException e) {
     System.err.println("Caught " + e);
   }
 }
} /* Output: (85% match)
Aug 30, 2005 4:02:31 PM LoggingException <init>
SEVERE: LoggingException
       at LoggingExceptions.main(LoggingExceptions.java:19)

Caught LoggingException
Aug 30, 2005 4:02:31 PM LoggingException <init>
SEVERE: LoggingException
       at LoggingExceptions.main(LoggingExceptions.java:24)

Caught LoggingException
*///:~
