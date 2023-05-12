package org.example;

import java.util.stream.IntStream;

public class Ex09 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // IntStream basic operations
    public static void main(String[] args) {
        int[] values = {3, 13, 6, -1, 4, 8, 2, 5, 9};

        // Display original values
        System.out.print("Original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));

        // count, min, max, sum, and average of the values
        long count = IntStream.of(values).count();
        System.out.printf("%nCount: %d%n", count);

        int min = IntStream.of(values).min().getAsInt();
        System.out.printf("Min: %d%n", min);

        int max = IntStream.of(values).max().getAsInt();
        System.out.printf("Max: %d%n", max);

        int sum = IntStream.of(values).sum();
        System.out.printf("Sum: %d%n", sum);

        double average = IntStream.of(values).average().getAsDouble();
        System.out.printf("Average: %f%n", average);
    }
}
