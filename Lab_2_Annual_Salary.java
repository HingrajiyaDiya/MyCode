package MyPackage;

import java.util.Scanner;

class User 
{
    protected int id;
    protected String name;

    public User(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
}

class MyEmployee extends User 
{
    private double salary;

    public MyEmployee(int id, String name, double salary) 
    {
        super(id, name);
        this.salary = salary;
    }

    public double calculateAnnualSalary() 
    {
        return salary * 12;
    }
}

public class Lab_2_Annual_Salary 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Id: ");
        int id = scanner.nextInt();
        
        System.out.print("name: ");
        String name = scanner.next();
        
        System.out.print("salary: ");
        double salary = scanner.nextDouble();
        
        MyEmployee employee = new MyEmployee(id, name, salary);
        
        double annualSalary = employee.calculateAnnualSalary();
        
        System.out.println("Annual Salary : " + annualSalary);
        
        scanner.close();
    }
}