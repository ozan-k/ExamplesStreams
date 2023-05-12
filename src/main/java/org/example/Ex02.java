package org.example;

import java.util.Comparator;
import java.util.List;

public class Ex02 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Motivating example : with streams
    public static void main(String[] args) {
        Dog d1 = new Dog("Max", 50, 8);
        Dog d2 = new Dog("Marley", 60, 10);
        Dog d3 = new Dog("Rocky", 30, 5);
        Dog d4 = new Dog("Bear", 70, 12);
        Dog d5 = new Dog("Luna", 30, 13);
        Dog d6 = new Dog("Luna", 25, 10);

        List<Dog> dogs = List.of(d1, d2, d3, d4, d5, d6);
        System.out.println("Original array: " + dogs);

        Dog tallest = dogs.stream()
                .max(Comparator.comparing(dog -> dog.height))
                .get();

        System.out.println("The tallest dog is: " + tallest);

        double averageWeight = dogs.stream()
                .mapToInt(dog -> dog.weight)
                .average()
                .orElse(0);

        System.out.println("The average weight is: " + averageWeight);
    }
}
