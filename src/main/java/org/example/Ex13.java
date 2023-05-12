package org.example;

import java.util.stream.IntStream;

public class Ex13 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Finding and matching
    public static void main(String[] args) {
        boolean allEven = IntStream.range(0, 10)
                .allMatch(value -> value % 2 == 0);
        System.out.printf("All numbers are even: %b%n", allEven);

        boolean anyEven = IntStream.range(0, 10)
                .anyMatch(value -> value % 2 == 0);
        System.out.printf("Some number is even: %b%n", anyEven);

        int first = IntStream.range(0, 10)
                .findFirst()
                .getAsInt();
        System.out.printf("First number: %d%n", first);

        int any = IntStream.range(0, 10)
                .findAny()
                .getAsInt();
        System.out.printf("Any number: %d%n", any);
    }
}
