package com.FOS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Register\n2. Login\n3. View Menu\n4. Place Order\n5. View Order History\n6. Admin\n7. Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    app.registerUser();
                    break;
                case 2:
                    app.loginUser();
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

