package org.example;

import java.util.stream.IntStream;

public class Ex12 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Filtering, mapping, and sorting
    public static void main(String[] args) {
        int[] values = {8, 3, 1, 4, 7, 6, 5, 2};

        IntStream.of(values)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sorted()
                .forEach(i -> System.out.printf("%d ", i));
    }
}
