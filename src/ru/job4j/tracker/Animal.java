package ru.job4j.tracker;

public class Animal extends Predator {
    public Animal() {
        super();
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
