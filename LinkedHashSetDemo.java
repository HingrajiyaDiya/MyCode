package MyPackage;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("\nElements after removing duplicates (Insertion Order):");
        for (int num : set) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nTotal number of unique elements: " + set.size());

        sc.close();
    }
}
