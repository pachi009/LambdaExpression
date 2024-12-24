package com.lambda.example;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run() method called");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = () -> System.out.println("run() method called using Runnable Lambda" );
        runnable.run();

        Thread threadLambda = new Thread(() -> System.out.println("run() method called using Thread Lambda"));
        threadLambda.start();
    }
}
