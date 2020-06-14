package ru.job4j.inheritance;

public class ToyCat extends Cat {
    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
    }
}
