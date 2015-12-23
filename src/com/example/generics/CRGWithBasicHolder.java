package com.example.generics;

//: generics/CRGWithBasicHolder.java
class Subtype extends BasicHolder<Subtype> {}

public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1 = new Subtype(), st2 = new Subtype();
        st1.set(st2);
        Subtype st3 = st1.get();
        st1.f();
    }
} /* Output:
Subtype
*///:~

//This is the essence of CRG: The base class substitutes the derived class for its parameters.