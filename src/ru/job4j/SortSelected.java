package ru.job4j;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
                int min = MinDiapason.findMin(data, i, data.length - 1);
                int index = FindLoop.indexOf(data, min, 0, data.length - 1);
                min = data[i];
                data[i] = data[index];
                data[index] = min;
            }
        return data;
    }
}