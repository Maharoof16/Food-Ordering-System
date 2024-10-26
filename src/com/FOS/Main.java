package com.FOS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Swigato Eats");
        
        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    app.registerUser();
                    break;
                case 2:
                    app.loginUser();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

