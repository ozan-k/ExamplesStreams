package org.example;

public class Dog {
    public String name;
    public int height;
    public int weight;

    public Dog(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return String.format("(%s: %dkg, %dcm)", name, weight, height);
    }
}
