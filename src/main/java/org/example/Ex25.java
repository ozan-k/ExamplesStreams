package org.example;

import java.util.Arrays;
import java.util.List;

public class Ex25 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Operations ~ Summing and averaging show ratings
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

        System.out.printf(
                "%nAverage show rating: %.2f%n",
                list.stream()
                        .mapToInt(TVShow::getRating)
                        .average()
                        .orElse(0)
        );

        System.out.printf(
                "%nSum of show ratings: %d of %d",
                list.stream()
                        .mapToInt(TVShow::getRating)
                        .reduce(0, (aggregated, value) -> aggregated + value),
                list.size() * 100
        );

    }
}
