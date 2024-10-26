package com.FOS;

import java.util.*;

public class FoodOrderingSystem {
    Scanner scan = new Scanner(System.in);

    public void registerUser() {
        System.out.print("Enter User Name: ");
        String userName = scan.nextLine();
        System.out.print("Enter Password: ");
        String password = scan.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Enter emailID: ");
        String email = scan.nextLine();
		User user=new User(userName, password, phoneNumber, email);
		user.registerUser();
        
    }

    public void loginUser() {
        System.out.print("Enter User Email / Phone Number: ");
        String userName = scan.nextLine();
        System.out.print("Enter Password: ");
        String password = scan.nextLine();
        if(User.loginUser(userName, password)) {
        	System.out.println("Login Successful");
        }else {
        	System.out.println("Invalid Credentials ! Login with valid user credentials or register");
        };
		
        
       
    }

   
}

