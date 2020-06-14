package ru.job4j.condition;


public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
       int rsl = max(second, third);
       return max(first, rsl);
    }

    public static int max(int first, int second, int third, int fourth) {
        int rsl = max(second, third, fourth);
        return max(first, rsl);
    }
}
