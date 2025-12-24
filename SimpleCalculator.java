package MyPackage;

import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("--- Simple Calculator ---");
        System.out.println("Use +, -, *, / for math. Press 'X' to exit.");

        while (keepRunning) 
        {
            System.out.print("\nEnter operator (or X to quit): ");
            char op = input.next().charAt(0);

            if (op == 'X' || op == 'x') 
            {
                keepRunning = false;
                System.out.println("Exiting... Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            switch (op) 
            {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) 
                    {
                        System.out.println("Result: " + (num1 / num2));
                    } 
                    else 
                    {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please try again.");
            }
        }
        input.close();
    }
}