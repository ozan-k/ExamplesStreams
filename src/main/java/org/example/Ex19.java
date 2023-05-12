package org.example;

import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Ex19 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Optional int stream
    public static void main(String[] args) {
        OptionalDouble averageContainer = IntStream.of(3, 13, 6, 1, 4, 8, 9)
                .average();

        System.out.printf("Is average present: %b%n", averageContainer.isPresent());

        try {
            double average = averageContainer.getAsDouble();
            System.out.printf("Average: %f%n", average);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown because there is no average!");
        }

        double orElseAverage = averageContainer.orElse(-1);
        System.out.printf("Average or else: %f%n", orElseAverage);
    }
}
