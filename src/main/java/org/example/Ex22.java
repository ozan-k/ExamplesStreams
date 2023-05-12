package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex22 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Operations ~ Mapping shows to unique category strings
    public static void main(String[] args) {
        TVShow[] shows = {
                new TVShow("Rick and Morty", 2013, "Comedy", 100),
                new TVShow("Game of Thrones", 2011, "Drama", 92),
                new TVShow("Stranger Things", 2016, "Terror", 90),
                new TVShow("Friends", 1994, "Comedy", 99),
                new TVShow("House of Cards", 2013, "Drama", 85),
                new TVShow("The Walking Dead", 2010, "Terror", 78),
                new TVShow("The Good Place", 2016, "Comedy", 86),
        };

        List<TVShow> list = Arrays.asList(shows);

        System.out.printf("%nUnique categories in ascending order: %n");
        list.stream()
                .map(TVShow::getCategory)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.printf("%nDisplay title and year, but sorted by rating: %n");
        list.stream()
                .sorted(Comparator.comparing(TVShow::getRating)
                        .reversed())
                .map(TVShow::getQualifiedName)
                .forEach(System.out::println);

    }
}
