package com.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = "Raja";
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        Optional<String> optionalName = Optional.of(name);
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get());
        } else {
            System.out.println("No Object found");
        }
        System.out.println(optionalName);

        Optional<Object> optionalNull = Optional.ofNullable(null);
        System.out.println(optionalNull);

        String getValue = Optional.of(name).get();
        System.out.println(getValue);

    }
}
