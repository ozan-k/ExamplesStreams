package org.example;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex06 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Creating int streams with iterate and generate
    public static void main(String[] args) {
        IntStream.iterate(1, x -> x * 2)
                .limit(5)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        IntStream.iterate(0, x -> x + 3)
                .limit(5)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        Random r = new Random();
        IntStream.generate( () -> r.nextInt(50))
                .limit(5)
                .forEach(x -> System.out.print(x + " "));
    }
}
