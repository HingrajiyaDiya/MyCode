package MyPackage;

import java.util.Scanner;

public class Lab_1_FindMaximum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double maximum = (num1 > num2) ? num1 : num2;
        
        System.out.println("The maximum number is: " + maximum);
        
        scanner.close();
    }
}