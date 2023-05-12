package org.example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex10 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // IntStream summary statistics
    public static void main(String[] args) {
        int[] values = {3, 13, 6, -1, 4, 8, 2, 5, 9};

        // Display original values
        System.out.print("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));

        // count, min, max, sum, and average of the values
        IntSummaryStatistics stat = IntStream.of(values).summaryStatistics();

        System.out.printf("%nCount: %d%n", stat.getCount());
        System.out.printf("Min: %d%n", stat.getMin());
        System.out.printf("Max: %d%n", stat.getMax());
        System.out.printf("Sum: %d%n", stat.getSum());
        System.out.printf("Average: %f%n", stat.getAverage());
    }
}
