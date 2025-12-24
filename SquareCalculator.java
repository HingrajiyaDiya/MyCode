package MyPackage;

import java.util.Scanner;

public class SquareCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int result = findSquare(n);
        
        System.out.println("The square is: " + result);
        input.close();
    }

    public static int findSquare(int num) 
    {
        return num * num; 
    }
}