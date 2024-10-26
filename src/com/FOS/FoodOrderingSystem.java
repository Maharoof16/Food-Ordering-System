package com.FOS;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrderingSystem {
    private Scanner scan = new Scanner(System.in);
    private User user;

    public void registerUser() {
        System.out.print("Enter User Name: ");
        String userName = scan.nextLine();
        System.out.print("Enter Password: ");
        String password = scan.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Enter Email ID: ");
        String email = scan.nextLine();

        user = new User(userName, password, phoneNumber, email);
        user.registerUser();
        postRegistrationOptions();
       
    }
    
    private void postRegistrationOptions() {
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    loginUser();
                    return; 
                case 2:
                    System.out.println("Exiting...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

   

    public void loginUser() {
        System.out.println("Enter User Email/Phone Number: ");
        String userName = scan.nextLine();
        System.out.println("Enter Password: ");
        String password = scan.nextLine();
        
        if (User.loginUser(userName, password)) {
            System.out.println("Login Successful!");
            showPostLoginOptions();
        } else {
            System.out.println("Invalid Credentials! Please login with valid user credentials or register.");
        }
    }
    
    private void showPostLoginOptions() {
        while (true) {
            System.out.println("1. View Restaurants");
            System.out.println("2. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch (choice) {
                case 1:
                    
                    System.out.println("Restaurants");
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
      }
}
