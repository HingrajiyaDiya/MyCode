package MyPackage;

import java.util.*;

public class SortStringsUsingMap 
{
    public static void main(String[] args) 
    {
        List<String> input = new ArrayList<>();
        input.add("Rahul");
        input.add("Zara");
        input.add("Amit");
        input.add("Priya");
        
        System.out.println("List Before Sort: " + input);
        
        Map<String, String> map = new TreeMap<>();
        for (String s : input) 
        {
            map.put(s, s);
        }
        
        List<String> sorted = new ArrayList<>(map.keySet());
        
        System.out.println("List After Sort: " + sorted);
    }
}