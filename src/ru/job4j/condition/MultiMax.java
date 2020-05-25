package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int checksecond = second >= third && second >= first ? second : third;
        int result = first >= second & first >= third ? first : checksecond;
        return result;
    }
}
