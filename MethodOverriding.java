package MyPackage;

class Bank 
{
    double getInterest() 
    {
        return 0;
    }
}

class SBI extends Bank 
{
    double getInterest() 
    {
        return 6.5;
    }
}

public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        Bank b = new SBI();
        System.out.println(b.getInterest());
    }
}
