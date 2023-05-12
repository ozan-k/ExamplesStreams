package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex15 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Collecting int streams
    public static void main(String[] args) {
        List<Integer> values = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(values);

        String s = IntStream.range(0, 10)
                .mapToObj(x -> String.valueOf(x))
                .collect(Collectors.joining(" - ", "{", "}"));

        System.out.println(s);
    }
}
