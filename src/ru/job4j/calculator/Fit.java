package ru.job4j.calculator;

import java.sql.SQLOutput;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(170);
        System.out.println("ideal weight for men with a height of 170 is " + man + " kilograms");
        System.out.println("ideal weight for women with a height of 170 is " + woman + " kilograms");
    }
}
