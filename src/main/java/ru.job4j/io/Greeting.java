package ru.job4j.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You 're Welcome! What's your name ?");
        String name = sc.nextLine();
        System.out.println(name + ", we glad to see you!");
    }
}
