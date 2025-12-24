package MyPackage;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your role: ");
        String role = input.next();

        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome Admin");
        }
        input.close();
    }
}