package MyPackage;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency 
{
    public static void main(String[] args) 
    {

        String[] words = {"Apple", "Banana", "Apple", "Mango", "Banana", "Apple"};

        System.out.println("Words:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nWords Count:");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        map.forEach((key, value) ->
            System.out.println(key + " → " + value)
        );
    }
}
