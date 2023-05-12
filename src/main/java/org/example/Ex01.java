package org.example;

import java.util.List;

public class Ex01 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Motivating example : for loop
    public static void main(String[] args) {
        Dog d1 = new Dog("Max", 50, 8);
        Dog d2 = new Dog("Marley", 60, 10);
        Dog d3 = new Dog("Rocky", 30, 5);
        Dog d4 = new Dog("Bear", 70, 12);
        Dog d5 = new Dog("Luna", 30, 13);
        Dog d6 = new Dog("Luna", 25, 10);

        List<Dog> dogs = List.of(d1, d2, d3, d4, d5, d6);
        System.out.println("Original array: " + dogs);

        Dog tallest = dogs.get(0);
        for (Dog dog : dogs) {
            if (dog.height > tallest.height) {
                tallest = dog;
            }
        }

        System.out.println("The tallest dog is: " + tallest);

        int sum = 0;
        for (Dog dog : dogs) {
            sum += dog.weight;
        }
        double averageWeight = (double) sum / dogs.size();

        System.out.println("The average weight is: " + averageWeight);
    }
}
