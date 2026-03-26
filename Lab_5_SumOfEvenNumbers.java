package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_5_SumOfEvenNumbers 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) 
        {
            list.add(sc.nextInt());
        }

        int sum = 0;
        for (int num : list) 
        {
            if (num % 2 == 0) 
            {
                sum += num;
            }
        }

        System.out.println("sum of even number : " + sum);
        
        sc.close();
    }
}
