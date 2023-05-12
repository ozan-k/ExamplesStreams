package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Ex20 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Operations ~ Filtering a stream
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

        // Displays all shows
        System.out.printf("TV shows:%n");
        list.stream().forEach(System.out::println);

        // Predicate that returns true for ratings greater than 90
        Predicate<TVShow> highRatings = tvShow -> tvShow.getRating() > 90;

        // Displays only shows rated over 90 sorted by rating (ascending)
        System.out.printf("%nShows rated over 90:%n");
        list.stream()
                .filter(highRatings)
                .sorted(Comparator.comparing(TVShow::getRating))
                .forEach(System.out::println);

        // Displays a show rated over 90
        System.out.printf("%nA show rated over 90:%n%s",
                list.stream()
                        .filter(highRatings)
                        .findAny()
                        .get());
    }
}
