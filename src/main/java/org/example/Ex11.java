package org.example;

import java.util.stream.IntStream;

public class Ex11 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // IntStream reduce
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        int sum = IntStream.of(values)
                .reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + sum);

        int sumOfSquares = IntStream.of(values)
                .reduce(0, (x, y) -> x + y * y);
        System.out.println("Sum of squares: " + sumOfSquares);

        int product = IntStream.of(values)
                .reduce(1, (x, y) -> x * y);
        System.out.println("Product: " + product);
    }
}
