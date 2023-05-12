package org.example;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex17 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Exercise ~ with stream
    public static void main(String[] args) {
        // SecureRandom r = new SecureRandom();
        Random r = new Random();
        IntStream.range(0,6000000)
                .map(value -> r.nextInt(6))
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((side, count) -> System.out.printf("%s: %s%n", side+1, count));

        System.out.println();

        IntStream.generate(() -> r.nextInt(6))
                .limit(6000000)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((side, count) -> System.out.printf("%s: %s%n", side+1, count));

        System.out.println();

        int[] result = new int[6];
        IntStream.generate(() -> r.nextInt(6))
                .limit(6000000)
                .forEach(value -> result[value]++);

        IntStream.range(0,6).forEach(i -> System.out.println((i+1) + ": " + result[i]));

    }
}
