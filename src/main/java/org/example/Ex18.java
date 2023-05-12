package org.example;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Ex18 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Optional Demo
    public static void main(String[] args) {
        Optional<Integer> container = Optional.of(10);

        System.out.printf("Is value present? %b%n", container.isPresent());
        System.out.printf("Value: %d%n", container.get());
        System.out.printf("Value or else: %d%n", container.orElse(0));
        System.out.printf("Value or else get: %d%n", container.orElseGet(() -> 1));
        container.ifPresent(value -> System.out.printf("Value is present: %d%n", value));

        Optional<Integer> emptyContainer = Optional.empty();

        System.out.printf("%nIs value present? %b%n", emptyContainer.isPresent());

        try {
            System.out.printf("Value: %d%n", emptyContainer.get());
        } catch (NoSuchElementException e) {
            System.out.printf("%s: %s%n", e.getClass().getName(), e.getMessage());
        }

        System.out.printf("Value or else: %d%n", emptyContainer.orElse(0));
        System.out.printf("Value or else get: %d%n", emptyContainer.orElseGet(() -> 1));
        emptyContainer.ifPresent(value -> System.out.printf("Value is present: %d", value));
    }
}
