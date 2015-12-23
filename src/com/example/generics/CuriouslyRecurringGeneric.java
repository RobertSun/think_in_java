package com.example.generics;

//: generics/CuriouslyRecurringGeneric.java
class GenericType<T> {}

public class CuriouslyRecurringGeneric
        extends GenericType<CuriouslyRecurringGeneric> {} ///:~