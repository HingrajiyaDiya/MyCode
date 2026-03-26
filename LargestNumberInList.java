package MyPackage;

import java.util.*;

public class LargestNumberInList 
{
    public static void main(String[] args) 
    {

        List<Integer> numbers = Arrays.asList(10, 30, 20, 50, 40);

        System.out.println("Number List :");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int largest = numbers.get(0);
        for (int num : numbers) 
        {
            if (num > largest) 
            {
                largest = num;
            }
        }

        System.out.println("\n\nOutput:");
        System.out.println("Largest number = " + largest);
    }
}
