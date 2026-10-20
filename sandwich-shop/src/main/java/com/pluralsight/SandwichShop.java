package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        double regularPrice = 5.45f;
        double largePrice = 8.95f;

        System.out.println("Welcome to the Sandwich shop!");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95");
        System.out.print("Select your Size: ");
        int size = scanner.nextInt();

        double basePrice = 0.0;
        if (size == 1) {
            basePrice = regularPrice;
        } else if (size == 2) {
            basePrice = largePrice;


        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double Discount = 0.0;
        if (age < 18){
            Discount = 0.90;
        } else if (age <= 65) {
            Discount = 0.80;

        }

        double finalPrice = basePrice * Discount;
        System.out.printf("That will be $%.2f%n", finalPrice);


    }

}