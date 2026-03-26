package MyPackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapItems 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> items = new LinkedHashMap<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            items.put(name, qty);
        }

        System.out.println("\nItems in insertion order:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.print("\nEnter item name to update quantity: ");
        String updateItem = sc.nextLine();

        if (items.containsKey(updateItem)) 
        {
            System.out.print("Enter new quantity: ");
            int newQty = sc.nextInt();
            items.put(updateItem, newQty);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Item not found.");
        }

        System.out.print("\nEnter minimum quantity limit: ");
        int limit = sc.nextInt();

        items.entrySet().removeIf(entry -> entry.getValue() < limit);

        System.out.println("\nItems after removing quantities less than " + limit + ":");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
