package MyPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_8_PhoneDirectory
{
    public static void main(String[] args)
    {
        Map<String, String> phoneDirectory = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) 
        {
            System.out.println("\nPhone Directory Menu:");
            System.out.println("1. Add a new name and phone number");
            System.out.println("2. Find a phone number by name");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter the phone number: ");
                    String phoneNumber = scanner.nextLine().trim();
                    
                    if (!name.isEmpty() && !phoneNumber.isEmpty()) 
                    {
                        phoneDirectory.put(name, phoneNumber);
                        System.out.println("Entry added successfully.");
                    }
                    else 
                    {
                        System.out.println("Name and phone number cannot be empty.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine().trim();
                    
                    if (phoneDirectory.containsKey(searchName)) 
                    {
                        System.out.println("Phone number for " + searchName + ": " + phoneDirectory.get(searchName));
                    }
                    else 
                    {
                        System.out.println("Name not found in the directory.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting the phone directory. Goodbye!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }
}