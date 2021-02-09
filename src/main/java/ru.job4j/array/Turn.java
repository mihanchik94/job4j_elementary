package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int size = array.length;
        for (int a = 0; a < size / 2; a++) {
            int temp =  array[size - a - 1];
            array[size - a - 1] = array[a];
            array[a] = temp;
        }
        return array;
    }
}
