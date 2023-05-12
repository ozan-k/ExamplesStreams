package org.example;

import java.util.stream.IntStream;

public class Ex05 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Creating int streams
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream.rangeClosed(0, 10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
