package MyPackage;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = input.nextInt(); 

        if (marks >= 35) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        
        input.close(); 
    }
}