package MyPackage;

import java.util.HashMap;
import java.util.Map;

public class Lab_7_CricketerScoreMap 
{
    public static void main(String[] args)
    {
        Map<String, Integer> cricketerScores = new HashMap<>();
        
        cricketerScores.put("Virat Kohli", 120);
        cricketerScores.put("Sachin Tendulkar", 200);
        cricketerScores.put("Rohit Sharma", 89);
        cricketerScores.put("MS Dhoni", 56);
        
        String batsmanName = "Rohit Sharma";
        if (cricketerScores.containsKey(batsmanName))
        {
            System.out.println(batsmanName + "'s Score :" + cricketerScores.get(batsmanName));
        } else
        {
            System.out.println("Batsman not found.");
        }
    }
}