/**
 * Filename:    MultiIterableClass.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-25 下午7:18:57
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-25     Robert Sun     1.0         1.0 Version
 */
package com.test.holding;

//: holding/MultiIterableClass.java
//Adding several Adapter Methods.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterableClass extends IterableClass {
public Iterable<String> reversed() {
 return new Iterable<String>() {
   public Iterator<String> iterator() {
     return new Iterator<String>() {
       int current = words.length - 1;
       public boolean hasNext() { return current > -1; }
       public String next() { return words[current--]; }
       public void remove() { // Not implemented
         throw new UnsupportedOperationException();
       }
     };
   }
 };
}
public Iterable<String> randomized() {
 return new Iterable<String>() {
   public Iterator<String> iterator() {
     List<String> shuffled =
       new ArrayList<String>(Arrays.asList(words));
     Collections.shuffle(shuffled, new Random(47));
     return shuffled.iterator();
   }
 };
}
public static void main(String[] args) {
 MultiIterableClass mic = new MultiIterableClass();
 for (String s : mic.reversed()) {
	 System.out.print(s + " ");
 }
 System.out.println();
 for (String s : mic.randomized()) {
	 System.out.print(s + " ");
 }
 System.out.println();
 for (String s : mic) {
	 System.out.print(s + " ");
 }
}
} /* Output:
banana-shaped. be to Earth the know we how is that And
is banana-shaped. Earth that how the be And we know to
And that is how we know the Earth to be banana-shaped.
*///:~
