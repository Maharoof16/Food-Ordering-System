package com.FOS;

import java.io.*;

public class User {
    private String userName;
    private String password;
    private String phoneNumber;
    private String email; 

    public User(String userName, String password, String phoneNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    private boolean isRegistered() {
        String path = "D:\\Full-Stack\\FoodOrderingSystem\\data\\users.txt";
        File file = new File(path);
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length >= 4) {
                String existingPhone = userData[2];
                String existingEmail = userData[3];

                if (existingPhone.equals(phoneNumber)) {
                    System.out.println("Phone number already registered. Please login.");
                    return true;
                }

                if (existingEmail.equals(email)) {
                    System.out.println("Email already registered. Please login.");
                    return true;
                }
              }
            }
        } catch (Exception error) {
            System.out.println("Error checking registration: " + error.getMessage());
        }
        
        return false; 
    }

    public void registerUser() {
        if (isRegistered()) {
            return;
        }
        String path = "D:\\Full-Stack\\FoodOrderingSystem\\data\\users.txt";
        File file = new File(path);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(userName + "," + password + "," + phoneNumber + "," + email);
            bw.newLine();
            System.out.println("Registration successful! You can now login.");
        } catch (Exception error) {
            System.out.println("Error registering user: " + error.getMessage());
        }
    }
    
    public static boolean loginUser(String userName, String password) {
        String path = "D:\\Full-Stack\\FoodOrderingSystem\\data\\users.txt";
        File file = new File(path);
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length >= 4) {
                String existingPassword = userData[1];
                String existingPhone = userData[2];
                String existingEmail = userData[3];

                if ((existingPhone.equals(userName) || existingEmail.equals(userName)) && existingPassword.equals(password)) {
                    return true;
                }
               }
            }
        } catch (Exception error) {
            System.out.println("Error during login: " + error.getMessage());
        }
        return false;
    }
}
