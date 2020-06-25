package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
    }

    @Override
    public void passengers(int people) {
    }

    @Override
    public float price(float fuel) {
        float price = 1.5f; // 1 литр топлива стоит 1.5 у.е.
        return price * fuel;
    }
}
