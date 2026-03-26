package MyPackage;

import java.util.*;

class Student 
{
    int id;
    String name;

    Student(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public String toString() 
    {
        return id + " " + name;
    }
}

public class GenericListExample 
{

    public static <T> void printList(List<T> list) 
    {
        for (T item : list) 
        {
            System.out.println(item);
        }
    }

    public static void main(String[] args) 
    {

        List<String> names = Arrays.asList("Apple", "Banana", "Mango");

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sachin"));
        students.add(new Student(2, "Rahul"));

        System.out.println("Input: String List");
        printList(names);

        System.out.println("\nInput: Integer List");
        printList(numbers);

        System.out.println("\nInput: Student List");
        printList(students);
    }
}
