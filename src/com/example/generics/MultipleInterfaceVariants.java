package com.example.generics;

//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won’t compile)
interface Payable<T> {}
class Employee implements Payable<Employee> {}
//class Hourly extends Employee implements Payable<Hourly> {} ///:~

//Remove the generic parameters from both uses of Payable
// —as the compiler does during erasure—the code compiles.
