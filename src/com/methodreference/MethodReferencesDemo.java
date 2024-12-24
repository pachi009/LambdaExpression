package com.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String msg);
}

public class MethodReferencesDemo {

    static int addition(int a, int b){
        return a+b;
    }

    void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        // 1. Method Reference to static method
        // Using Lambda Expression
        Function<Integer, Double> f = input -> Math.sqrt(input);
        System.out.println(f.apply(36));
        // Using Method Reference
        Function<Integer, Double> f2 = Math::sqrt;
        System.out.println(f2.apply(36));

        // Using Lambda Expression
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodReferencesDemo.addition(a, b);
        System.out.println(biFunction.apply(10, 20));
        // Using Method Reference
        BiFunction<Integer, Integer, Integer> fun = MethodReferencesDemo::addition;
        System.out.println(fun.apply(10, 20));

        // 2. Method Reference to Instance method of an object
        // Using Lambda expression
        MethodReferencesDemo demoObject = new MethodReferencesDemo();
        Printable printable = (String msg) -> demoObject.display(msg);
        printable.print("Hello World!");
        // Using Method References
        Printable printableMethRef = demoObject::display;
        printableMethRef.print("Hello World!");
    }
}
