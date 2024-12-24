package com.lambda.example;

interface Addable {
    int add(int a, int b);
}

public class LambdaParameters {
    public static void main(String[] args) {
        Addable addable = ( a, b) -> {
            int x = a + b;
            return x;
        };
        System.out.println(addable.add(10, 50));
    }
}
