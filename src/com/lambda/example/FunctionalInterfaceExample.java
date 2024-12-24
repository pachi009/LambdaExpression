package com.lambda.example;


@FunctionalInterface
interface MyFunctionalInterface{
    void print(String message);
    default void m1(){
        System.out.println("m1()");
    }
    static void m2(){
        System.out.println("m2()");
    }
}

public class FunctionalInterfaceExample {
}
