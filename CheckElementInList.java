package MyPackage;

import java.util.*;

public class CheckElementInList 
{
    public static void main(String[] args) 
    {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int check = 30;

        System.out.println("Element List:");
        System.out.println(numbers);

        System.out.println("\nCheck: " + check);

        if (numbers.contains(check)) 
        {
            System.out.println("Output:");
            System.out.println("Found");
        } else {
            System.out.println("Output:");
            System.out.println("Not Found");
        }
    }
}
