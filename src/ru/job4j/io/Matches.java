package ru.job4j.io;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("На столе лежит 11 спичек. Берите по очереди от 1 до 3 спичек. Выигрывает тот, кто взял последнюю спичку.");
        int match = 11;
        while (match > 0) {
            System.out.println("Возьмите со стола от 1 до 3 спичек");
            int take = Integer.valueOf(input.nextLine());
            if (take == 1 || take == 2 || take == 3) {
                match = match - take;
                if (match <= 0) {
                    match = 0;
                }
                System.out.println("На столе осталось " + match);
            } else {
                System.out.println("Вы берете неверное количество спичек! Возьмите еще раз.");
                System.out.println("Осталось " + match + " спичек");
            }
            if (match <= 0) {
                System.out.println("Игра завершена!");
            }
            System.out.println();
        }
    }
}
