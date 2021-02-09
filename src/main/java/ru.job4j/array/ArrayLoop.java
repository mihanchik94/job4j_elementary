package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] function = new int[5];
        for (int index = 0; index < function.length; index++) {
            function[index] = index * 2 + 3;
        }
            for (int index = 0; index < function.length; index++) {
                System.out.println(function[index]);
            }
    }

}
