package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("180 rubles are " + dollar + " dollar");

        int euroIn = 140;
        int euroExpected = 2;
        int euroOut = rubleToEuro(euroIn);
        boolean euroPassed = euroExpected == euroOut;
        System.out.println("140 rubles are 2 euro. Test result : " + euroPassed);

        int dollarIn = 180;
        int dollarExpected = 3;
        int dollarOut = rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExpected == dollarOut;
        System.out.println("180 rubles are 3 dollars. Test result : " + dollarPassed);
    }
}