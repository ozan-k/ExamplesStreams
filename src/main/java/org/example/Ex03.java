package org.example;

import java.util.*;

public class Ex03 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Motivating example 2: for loop ~ sort ~ set
    public static void main(String[] args) {
        Dog d1 = new Dog("Max", 50, 8);
        Dog d2 = new Dog("Marley", 60, 10);
        Dog d3 = new Dog("Rocky", 30, 5);
        Dog d4 = new Dog("Bear", 70, 12);
        Dog d5 = new Dog("Luna", 30, 13);
        Dog d6 = new Dog("Luna", 25, 10);

        List<Dog> dogs = List.of(d1, d2, d3, d4, d5, d6);
        System.out.println("Original array: " + dogs);

        Set<String> nameSet = new HashSet<>();

        for (Dog dog : dogs) {
            if (dog.weight > 5 && dog.height < 60) {
                nameSet.add(dog.name);
            }
        }

        List<String> nameList = new ArrayList<>(nameSet);
        nameList.sort(Comparator.naturalOrder());

        System.out.println("Dog names: " + nameList);
    }
}
