package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many products? ");
        int productNum = Integer.parseInt(scan.nextLine());

        Product[] cart = new Product[productNum];

        for (int i = 0; i < productNum; i++){
            boolean validOption = false;
            do {
                System.out.println("What product do you want to add?");
                System.out.println("1 - Smartphone");
                System.out.println("2 - Tv");
                System.out.println("3 - Headphones");
                String option = scan.nextLine();

                validOption = option.equals("1") || option.equals("2") || option.equals("3");

                if(validOption){
                    System.out.println("Product name:");
                    String name = scan.nextLine();
                    System.out.println("Product description:");
                    String description = scan.nextLine();
                    System.out.println("Product price:");
                    BigDecimal price = new BigDecimal(scan.nextLine());
                    System.out.println("Product iva:");
                    BigDecimal iva = new BigDecimal(scan.nextLine());

                    switch (option) {
                        case "1" -> {
                            System.out.println("IMEI: ");
                            String IMEI = scan.nextLine();
                            System.out.println("Memory capacity: ");
                            int capacity = Integer.parseInt(scan.nextLine());
                            cart[i] = new Smartphone(name, description, price, iva, IMEI, capacity);
                        }
                        case "2" -> {
                            System.out.println("Size: ");
                            int size = Integer.parseInt(scan.nextLine());
                            System.out.println("Smart (y/n): ");
                            boolean smart = scan.nextLine().equalsIgnoreCase("y");
                            cart[i] = new Tv(name, description, price, iva, size, smart);
                        }
                        case "3" -> {
                            System.out.println("Color: ");
                            String color = scan.nextLine();
                            System.out.println("Wireless (y/n): ");
                            boolean wireless = scan.nextLine().equalsIgnoreCase("y");
                            cart[i] = new Headphones(name, description, price, iva, color, wireless);
                        }
                        default -> {
                        }
                    }
                }else{
                    System.out.println("Invalid input");
                }
            }
            while (!validOption);
        }

        for (int i = 0; i < cart.length; i++){
            System.out.println("Product " + (i + 1));
            System.out.println(cart[i]);
        }
        
    }
}
