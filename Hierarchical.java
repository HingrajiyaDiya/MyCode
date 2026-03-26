package MyPackage;

class Employee 
{
    void work() 
    {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee 
{
    void develop() 
    {
        System.out.println("Developer is writing code");
    }
}

class Tester extends Employee 
{
    void test() 
    {
        System.out.println("Tester is testing the application");
    }
}

public class Hierarchical 
{
    public static void main(String[] args) 
    {
        Developer d = new Developer();
        d.work();
        d.develop();

        Tester t = new Tester();
        t.work();
        t.test();
    }
}
