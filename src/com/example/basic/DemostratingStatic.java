package com.example.basic;
/**
 * Filename:    DemostratingStatic.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-2-29 14:52:37
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-2-29     Robert Sun     1.0         1.0 Version
 */

/**
 * @author Robert Sun
 * Create at 2012-2-29 14:52:37
 */
public final class DemostratingStatic {

    /**
     * <p>Title: DemostratingStatic.</p>
     * <p>Description: </p>
    */
    private DemostratingStatic() {
    }

    /**
     * You got it.
     * @param args arguments
    */
    public static void main(final String[] args) {
//		InitialParam init1 = new InitialParam();
//		InitialParam init2 = new InitialParam();
        System.out.println("0:0" + InitialParam.C + "0");
//		System.out.println("1:1" + init1.c + "1");
//		System.out.print("2:2" + init2.c +"1");
    }

}
