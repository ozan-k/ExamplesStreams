package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ex21 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Operations ~ Sorting shows by multiple fields
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

        Function<TVShow, String> byCategory = TVShow::getCategory;
        Function<TVShow, Integer> byRating = TVShow::getRating;

        Comparator<TVShow> categoryThenRating =
                Comparator.comparing(byCategory).thenComparing(byRating);

        System.out.printf("%nShows in ascending order by category and then rating: %n");
        list.stream()
                .sorted(categoryThenRating)
                .forEach(System.out::println);

        System.out.printf("%nShows in descending order by category and then rating: %n");
        list.stream()
                .sorted(categoryThenRating.reversed())
                .forEach(System.out::println);
    }

}
