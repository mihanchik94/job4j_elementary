package ru.job4j.oop;

import java.util.Objects;

public class College {
    public static void main(String[] args) {
        // создали объект типа Freshman
        Freshman freshman = new Freshman();
        // привели объект типа Freshman к типу Pupil
        Pupil student = freshman;
        // привели объект типа Freshman к типу Obj
        Object ostudent = new Freshman();

    }
}
