package ru.job4j.ex;

public class UserNotFoundException extends Exception {
    public void println() {
        System.out.println("This user is not found!");
    }
}
