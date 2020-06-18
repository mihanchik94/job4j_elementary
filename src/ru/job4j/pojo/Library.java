package ru.job4j.pojo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("The stories", 220);
        Book second = new Book("Novels", 873);
        Book third = new Book("Clean code", 263);
        Book fourth = new Book("Poems", 114);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            System.out.println(bks.getName() + " " + bks.getPages());
        }
        System.out.println("Replace first and fourth books");
        Book[] bk = new Book[2];
        bk[0] = books[0];
        books[0] = books[3];
        books[3] = bk[0];
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            System.out.println(bks.getName() + " " + bks.getPages());
        }
        System.out.println("Shown only book.name -  Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            if (bks.getName().equals("Clean code")) {
                System.out.println(bks.getName() + " " + bks.getPages());
            }
        }
    }
}
