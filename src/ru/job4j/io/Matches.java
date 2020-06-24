package ru.job4j.io;


import java.util.Scanner;

public class Matches {
    public int choosePlayers(int number) {
        Scanner input = new Scanner(System.in);
        int rsl = 0;
        System.out.println("Ходит Игрок " + number);
        boolean game = true;
        while (game) {
            int select = Integer.valueOf(input.nextLine());
            if (select > 0 && select <= 3) {
                rsl = select;
                System.out.println("Игрок " + number + " сделал ход");
                break;
            } else {
                System.out.println("Вы берете неверное количество спичек! Возьмите еще раз.");
            }
        }
        return rsl;
    }


    public static void main(String[] args) {
        Matches game = new Matches();
        System.out.println("На столе лежит 11 спичек. Берите по очереди от 1 до 3 спичек. Выигрывает тот, кто взял последнюю спичку.");
        int match = 11;
        while (match > 0) {
            System.out.println("Возьмите со стола от 1 до 3 спичек");
            match -= game.choosePlayers(1);
            if (match <= 0) {
                System.out.println("Выиграл игрок 1");
                break;
            }
            System.out.println("На столе осталось " + match);
            match -= game.choosePlayers(2);
            if (match <= 0) {
                System.out.println("Выиграл игрок 2");
                break;
            }
            System.out.println("На столе осталось " + match);
        }
    }
}

