package MyPackage;

import java.util.HashMap;

public class Lab_7_HashMapEmptyCheck 
{
    public static void main(String[] args) 
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Is The HashMap Empty? " + map.isEmpty());

        map.clear();

        System.out.println("Is The HashMap Empty After clearing? " + map.isEmpty());
    }
}