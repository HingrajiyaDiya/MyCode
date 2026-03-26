package MyPackage;

import java.util.*;

public class FruitListExample 
{
    public static void main(String[] args) 
    {
    	List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");
        
        // Print the list using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < fruits.size(); i++) 
        {
            System.out.println(fruits.get(i));
        }
        
        // Print the list using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }
        
        // Print the list using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Convert List to Set to get unique elements
        Set<String> uniqueFruits = new HashSet<>(fruits);
        
        // Print the unique fruits
        System.out.println("\nUnique fruits (using Set):");
        for (String fruit : uniqueFruits) 
        {
            System.out.println(fruit);
        }
    }
}