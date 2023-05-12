package org.example;

import java.util.stream.IntStream;

public class Ex08 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Building streams manually
    public static void main(String[] args) {
        IntStream.builder()
                .add(0)
                .add(1)
                .add(2)
                .build()
                .forEach(x -> System.out.print(x + " "));
    }
}
