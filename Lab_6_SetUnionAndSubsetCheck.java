package MyPackage;

import java.util.HashSet;
import java.util.Set;

public class Lab_6_SetUnionAndSubsetCheck 
{
    public static void main(String[] args) 
    {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("cherry");

        Set<String> set2 = new HashSet<>();
        set2.add("cherry");
        set2.add("Date");
        set2.add("fig");

        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("Union Set: " + unionSet);

        boolean isSubset = set1.containsAll(unionSet);

        if (isSubset) 
        {
            System.out.println("Union set is a subset of set1");
        } 
        else 
        {
            System.out.println("Union set is not a subset of set1");
        }
    }
}