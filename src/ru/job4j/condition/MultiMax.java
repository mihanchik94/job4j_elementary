package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int checkFirst = first >= second ? first : second;
        int result = checkFirst >= third ? checkFirst : third;
        return result;
    }
}
