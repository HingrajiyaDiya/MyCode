package MyPackage;

public class FizzBuzz 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 50; i++) 
        {
            // Check for multiples of both 4 and 5 first
            if (i % 4 == 0 && i % 5 == 0) 
            {
                System.out.println("FizzBuzz");
            }
            // Next, multiples of 4 only
            else if (i % 4 == 0) 
            {
                System.out.println("Fizz");
            }
            // Then, multiples of 5 only
            else if (i % 5 == 0) 
            {
                System.out.println("Buzz");
            }
            // Otherwise just print the number
            else 
            {
                System.out.println(i);
            }
        }
    }
}