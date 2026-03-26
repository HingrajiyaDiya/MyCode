package MyPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIntegerReader 
{

    public static void main(String[] args) 
    {
        String fileName = "numbers.txt"; // Change this to your file name
        List<Integer> validIntegers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) 
            {
                lineNumber++;
                String[] tokens = line.trim().split("\\s+");

                for (String token : tokens) 
                {
                    if (token.isEmpty()) continue;

                    try {
                        int number = Integer.parseInt(token);
                        validIntegers.add(number);
                        System.out.println("Line " + lineNumber + ": Successfully read " + number);
                    	} 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Line " + lineNumber + ": Skipping invalid value '" + token + "'");
                    }
                }
            }

            // Display summary
            System.out.println("\n=== Summary ===");
            System.out.println("Total valid integers read: " + validIntegers.size());
            if (!validIntegers.isEmpty()) 
            {
                int sum = validIntegers.stream().mapToInt(Integer::intValue).sum();
                int min = validIntegers.stream().mapToInt(Integer::intValue).min().getAsInt();
                int max = validIntegers.stream().mapToInt(Integer::intValue).max().getAsInt();
                double average = validIntegers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

                System.out.println("Sum: " + sum);
                System.out.println("Minimum: " + min);
                System.out.println("Maximum: " + max);
                System.out.printf("Average: %.2f%n", average);
            } 
            else 
            {
                System.out.println("No valid integers were found in the file.");
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error: The file '" + fileName + "' was not found or could not be read.");
            System.out.println("Please check the file name and ensure it exists in the correct location.");
            System.out.println("Error details: " + e.getMessage());
        }
    }
}