package ru.job4j.condition;

import org.w3c.dom.ls.LSOutput;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String answer1 = DummyBot.answer("Привет, Бот.");
        String answer2 = DummyBot.answer("Пока.");
        System.out.println(answer1);
        System.out.println(answer2);
    }
}
