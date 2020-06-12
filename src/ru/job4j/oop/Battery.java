package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(6);
        Battery second = new Battery(2);
        System.out.println("first battery charge is " + first.load + " second battery charge is " + second.load);
        System.out.println("and after exchange");
        first.exchange(second);
        System.out.println("first battery charge is " + first.load + " second battery charge is " + second.load);
    }
}
