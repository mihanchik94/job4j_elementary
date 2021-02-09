package ru.job4j.ex;

    public class Fact {
        public static int calc(int n) {
            int rsl = 1;
            if (n < 0) {
                throw new IllegalArgumentException("The number n mus be more than 0");
            }
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }

        public static void main(String[] args) {
            System.out.println("Factorial of number 4 is: " + calc(4));
        }
    }
