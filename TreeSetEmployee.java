package MyPackage;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEmployee 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        TreeSet<String> employees = new TreeSet<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter employee names:");
        for (int i = 0; i < n; i++) 
        {
            employees.add(sc.nextLine());
        }

        System.out.println("\nEmployee names in sorted order:");
        for (String name : employees) 
        {
            System.out.println(name);
        }

        System.out.println("\nFirst employee name: " + employees.first());
        System.out.println("Last employee name: " + employees.last());

        System.out.print("\nEnter employee name to remove: ");
        String removeName = sc.nextLine();

        if (employees.remove(removeName)) 
        {
            System.out.println(removeName + " removed successfully.");
        } else 
        {
            System.out.println(removeName + " not found.");
        }

        System.out.println("\nUpdated employee list:");
        for (String name : employees) 
        {
            System.out.println(name);
        }

        sc.close();
    }
}
