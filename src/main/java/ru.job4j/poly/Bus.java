package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        String dest = "depot";
        System.out.println("Bus stop is " + dest);
    }

    @Override
    public void passengers(int people) {
        System.out.println("There're " + people + " in the bus");
    }

    @Override
    public float price(float fuel) {
        float price = 1.5f; // 1 литр топлива стоит 1.5 у.е.
        return price * fuel;
    }
}
