package MyPackage;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        if (num > 0) {
            System.out.println("The number is Positive.");
        }
        else
        {
        	System.out.println("The number is Nagitive.");
        }
        input.close();
    }
}