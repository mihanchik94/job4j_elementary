package ru.job4j.inheritance;

public class Cat {
    public boolean canPurr() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());
    }
}
