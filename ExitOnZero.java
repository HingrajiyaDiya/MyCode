package MyPackage;

import java.util.Scanner;

public class ExitOnZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("Zero entered. Exiting loop...");
                break; 
            }

            System.out.println("You entered: " + num);
        }

        System.out.println("Program Finished.");
        input.close();
    }
}