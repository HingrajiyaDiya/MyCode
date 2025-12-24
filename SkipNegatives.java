package MyPackage;

import java.util.Scanner;

public class SkipNegatives 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String validNumbers = "";

        while (true) 
        {
            System.out.print("Enter a number (0 to stop): ");
            int num = input.nextInt();

            if (num == 0) 
            {
                break;
            }

            if (num < 0) 
            {
                System.out.println("Negative skipped.");
                continue; 
            }

            validNumbers = validNumbers + num + " ";
        }

        System.out.println("Valid inputs entered: " + validNumbers);
        input.close();
    }
}