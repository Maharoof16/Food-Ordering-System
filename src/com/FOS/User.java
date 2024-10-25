package com.FOS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class User{
	private String userName;
	private String password;
	private String phoneNumber;
    private String email; 
	
	public User(String userName,String password,String phoneNumber,String email) {
		this.userName=userName;
		this.password=password;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	public boolean isRegistered() {
        String path = "D:\\Full-Stack\\FoodOrderingSystem\\data\\users.txt";
        File file=new File(path);
        
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            
            while ((line = br.readLine()) != null) {
            	String[] userDetails=line.split(",");
            	System.out.println(userDetails);
                
            }
        } catch (Exception error) {
            System.out.println("Error checking registration: " + error.getMessage());
        }
        return false; 
    }
	
	public void registerUser(){
		if (isRegistered()) {
            System.out.println("User already registered. Please login.");
            return;
        }
		String path="D:\\Full-Stack\\FoodOrderingSystem\\data\\users.txt";
		File file=new File(path);
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));) {
			bw.write(userName+","+password+","+phoneNumber+","+email);
			bw.newLine();
			System.out.println("User Registration successful!");
		}catch(Exception error) {
			System.out.println(error.getMessage());
		}
	}
	
	
	
	
	
}