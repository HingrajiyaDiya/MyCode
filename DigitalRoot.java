package MyPackage;

import java.util.Scanner;

public class DigitalRoot 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Handle negative numbers
        number = Math.abs(number);
        
        // Handle the case when input is 0
        if (number == 0) 
        {
            System.out.println("Result: 0");
            return;
        }
        
        // Keep summing digits until we get a single digit
        while (number >= 10) 
        {
            number = sumOfDigits(number);
            System.out.println("Intermediate sum: " + number);
        }
        
        System.out.println("Final single digit: " + number);
    }
    
    // Function to calculate sum of digits of a number
    public static long sumOfDigits(long n) 
    {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;  // Get last digit
            n /= 10;        // Remove last digit
        }
        return sum;
    }
}