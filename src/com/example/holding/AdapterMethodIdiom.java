/**
 * Filename:    AdapterMethodIdiom.java
 * Description:
 * Copyright:   Copyright (c)2010
 * Company:     英睿（大连）信息有限公司
 * @author:     Robert Sun
 * @version:    1.0
 * Create at:   2012-12-25 下午7:14:53
 *
 * Modification History:
 * Date         Author        Version       Description
 * ------------------------------------------------------------------
 * 2012-12-25     Robert Sun     1.0         1.0 Version
 */
package com.example.holding;

//: holding/AdapterMethodIdiom.java
//The "Adapter Method" idiom allows you to use foreach
//with additional kinds of Iterables.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 40713554144498755L;

public ReversibleArrayList(Collection<T> c) { super(c); }
public Iterable<T> reversed() {
 return new Iterable<T>() {
   public Iterator<T> iterator() {
     return new Iterator<T>() {
       private int current = size() - 1;
       public boolean hasNext() { return current > -1; }
       public T next() { return get(current--); }
       public void remove() { // Not implemented
         throw new UnsupportedOperationException();
       }
     };
   }
 };
}
}

public final class AdapterMethodIdiom {

	private AdapterMethodIdiom() { }

public static void main(String[] args) {
 ReversibleArrayList<String> ral =
   new ReversibleArrayList<String>(
     Arrays.asList("To be or not to be".split(" ")));
 // Grabs the ordinary iterator via iterator():
 for (String s : ral) {
	 System.out.print(s + " ");
 }
 System.out.println();
 // Hand it the Iterable of your choice
 for (String s : ral.reversed()) {
	 System.out.print(s + " ");
 }
}
} /* Output:
To be or not to be
be to not or be To
*///:~