package org.example;

import java.util.stream.IntStream;

public class Ex14 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Mapping int streams
    public static void main(String[] args) {
        IntStream.range(0, 4)
                .map(i -> i * i * i)
                .forEach(i -> System.out.printf("%d ", i));

        System.out.println();
        IntStream.range(0, 4)
                .mapToDouble(i -> i)
                .forEach(d -> System.out.printf("%f ", d));

        System.out.println();
        IntStream.range(0, 4)
                .mapToLong(i -> i)
                .forEach(l -> System.out.printf("%d ", l));

        System.out.println();
        IntStream.range(0, 4)
                .mapToObj(String::valueOf)
                .forEach(s -> System.out.printf("%s ", s));
    }
}
