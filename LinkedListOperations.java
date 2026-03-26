package MyPackage;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }
        
        System.out.println("Displaying in reverse order:");
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        
        System.out.println("Enter an integer to add at the beginning:");
        int firstValue = scanner.nextInt();
        numbers.addFirst(firstValue);
        
        System.out.println("Enter an integer to add at the end:");
        int lastValue = scanner.nextInt();
        numbers.addLast(lastValue);
        
        System.out.println("Updated list in reverse order:");
        iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        
        scanner.close();
    }
}