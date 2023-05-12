package org.example;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ex07 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Creating int streams from arrays
    public static void main(String[] args) {
        int[] values = {3, 13, 6, -1, 4, 8, 2, 5, 9};
        IntStream.of(values)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        IntStream.of(2, 7, 8, 1)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(5);

        list.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}
