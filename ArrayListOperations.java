package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names.add(scanner.nextLine());
        }
        System.out.println("-----------------------------");
        for (String name : names) {
            System.out.println(name);
        }
        
        System.out.println("Enter the name to insert:");
        String insertName = scanner.nextLine();
        System.out.println("Enter the index to insert at:");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("-----------------------------");
        names.set(index, insertName);  // Replace the value at the specified index
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------------------------");
        System.out.println("Enter the name to remove:");
        String removeName = scanner.nextLine();
        System.out.println("-----------------------------");
        names.remove(removeName);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------------------------");
        scanner.close();
    }
}