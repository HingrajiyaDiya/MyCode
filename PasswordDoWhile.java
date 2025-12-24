package MyPackage;

import java.util.Scanner;

public class PasswordDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String secret = "java123";
        String guess;

        do {
            System.out.print("Enter password: ");
            guess = input.next();
            
            if (!guess.equals(secret)) {
                System.out.println("Incorrect. Try again.");
            }
            
        } while (!guess.equals(secret));

        System.out.println("Access Granted!");
        input.close();
    }
}