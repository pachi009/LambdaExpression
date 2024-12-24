package com.lambda.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class FunctionImpl implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

class ConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class SupplierImpl implements Supplier<LocalDateTime> {
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function f = new FunctionImpl();
        System.out.println(f.apply("Prashanth"));
        Function<String, Integer> fun = (str) -> str.length();
        System.out.println(fun.apply("Prashanth"));

        Consumer consumer = new ConsumerImpl();
        consumer.accept("Suma");
        Consumer<String> con = (s) -> System.out.println(s);
        con.accept("Suma-Lambda expression");

        Supplier supplier = new SupplierImpl();
        System.out.println(supplier.get());
        Supplier<LocalDateTime> supplierLambda = () -> LocalDateTime.now();
        System.out.println(supplierLambda.get());
    }
}
