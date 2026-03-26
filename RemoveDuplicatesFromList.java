package MyPackage;

import java.util.*;

public class RemoveDuplicatesFromList 
{
    public static void main(String[] args) 
    {
        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Lily");
        
        System.out.println("Original list: " + flowers);
        
        Set<String> uniqueFlowers = new HashSet<>(flowers);
        
        System.out.println("List after removing duplicates: " + uniqueFlowers);
    }
}