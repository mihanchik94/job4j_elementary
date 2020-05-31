package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int small = post.length - 1;
        int big = word.length - 1;
        for (int i = 0; i < post.length; i++) {
            if (word[big - i] != post[small - i]) {
                    result = false;
                }
        }
        return result;
    }
}
