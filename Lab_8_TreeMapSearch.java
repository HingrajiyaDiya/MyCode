package MyPackage;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab_8_TreeMapSearch
{
    public static void main(String[] args)
    {
        Map<String, Integer> nameAgeMap = new TreeMap<>();
        
        nameAgeMap.put("Diya", 22);
        nameAgeMap.put("Rahul", 25);
        nameAgeMap.put("Sachin", 30);
        nameAgeMap.put("Kuntal", 35);
        nameAgeMap.put("Vasu", 28);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine().trim();
        
        if (nameAgeMap.containsKey(searchName))
        {
            System.out.println("Age of " + searchName + ": " + nameAgeMap.get(searchName));
        }
        else
        {
            System.out.println("Name not found.");
        }
        
        scanner.close();
    }
}