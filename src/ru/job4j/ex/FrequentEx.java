package ru.job4j.ex;

public class FrequentEx {
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (int index = 0; index <= shops.length; index++) { // программа выдаст исключение
            System.out.println(shops[index]);
        }
    //перепишем код с исправленной ситуацией
    String[] shp = {"Ebay", "Amazon", "Ozon"};
        for (int index = 0; index < shp.length; index++) { //  при таком раскладе программа не будет выдавать исключения
        System.out.println(shp[index]);
    }
}
}
