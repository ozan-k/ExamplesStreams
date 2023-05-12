package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ex24 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Operations ~ Counting shows per categories
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

        System.out.printf("%nCount shows per category:%n");
        Map<String, Long> showCountByCategory = list.stream()
                .collect(Collectors.groupingBy(TVShow::getCategory, TreeMap::new, Collectors.counting()));

        showCountByCategory.forEach((category, count) -> {
            System.out.printf("%s: %d%n", category, count);
        });
    }
}
