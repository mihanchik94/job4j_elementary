package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public static void main(String[] args) {
        TextReport jsn = new TextReport();
        String txt = jsn.generate("name : name", "body: body");
        System.out.println(txt);

    }
}
