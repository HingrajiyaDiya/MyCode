package MyPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> students = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.put(rollNo, marks);
        }

        System.out.println("\nStudents scoring more than 60 marks:");
        for (Map.Entry<Integer, Integer> entry : students.entrySet()) 
        {
            if (entry.getValue() > 60) 
            {
                System.out.println("Roll No: " + entry.getKey() + ", Marks: " + entry.getValue());
            }
        }

        int total = 0;
        for (int marks : students.values()) 
        {
            total += marks;
        }

        double average = (double) total / students.size();
        System.out.println("\nAverage Marks: " + average);

        sc.close();
    }
}
