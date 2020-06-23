package ru.job4j.io;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("“I'm the great Oracle. What would you like to know?");
        String question = sc.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Yes");
                break;
            case 1:
                System.out.println("No");
                break;
            default:
                System.out.println("Maybe");
        }
    }
}
