package com.lambda.example;

@FunctionalInterface
interface Shape{
    void draw();
}

public class LambdaExpression {

    public static void main(String[] args) {
        print(() -> System.out.println("Rectangle"));
        print(() -> System.out.println("Square"));
        print(() -> System.out.println("Circle"));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
