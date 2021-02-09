package ru.job4j.pojo;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            products[i] = (products.length > i + 1) ? products[i + 1] : null;
            }
        return products;
    }

        public static void main(String[]args) {
        Product[] products = new Product[5];
            products[0] = new Product("Milk", 10);
            products[1] = new Product("Bread", 4);
            products[2] = new Product("Egg", 19);
            products[3] = null;
            products[4] = new Product("Oil", 11);
            for (int i = 0; i < products.length; i++) {
                Product product = products[i];
                if (product != null) {
                    System.out.println(product.getName());
                } else {
                    System.out.println("null");
                }
            }
            System.out.println("Demonstration of deletion");
            delete(products, 1);
            System.out.println("Delete index[1]");
            for (int j = 0; j < products.length; j++) {
                Product product1 = products[j];
                if (product1 != null) {
                    System.out.println(product1.getName() + " " + product1.getCount());
                } else {
                    System.out.println("null");
                }
            }
        }
    }

