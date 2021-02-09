package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftI = 0;
        int rightI = 0;
        int i = 0;
        while (i < rsl.length) {
            if (leftI == left.length && rightI < right.length) {
                rsl[i] = right[rightI++];
            } else if (leftI < left.length && rightI == right.length) {
                rsl[i] = left[leftI++];
            } else if (left[leftI] >= right[rightI]) {
                rsl[i] = right[rightI++];
            } else if (left[leftI] <= right[rightI]) {
                rsl[i] = left[leftI++];
            }
            i++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}