package org.example;

public class TVShow {
    String name;
    String category;
    int rating;
    int year;

    public TVShow(String name, int year, String category, int rating) {
        this.name = name;
        this.year = year;
        this.category = category;
        this.rating = rating;
    }

    public String getQualifiedName(){
        return String.format("%s (%d)", name, year);
    }

    @Override
    public String toString() {
        return String.format("%-25s  Category: %-6s   Rating: %s", getQualifiedName(), category, rating);
    }

    // getters and setters
    public int getRating(){
        return rating;
    }

    public String getCategory(){
        return category;
    }

}