package MyPackage;

class AverageThread extends Thread
{
    @Override
    public void run()
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        double average = (double) sum / 10;
        System.out.println("Average of the first 10 numbers: " + average);
    }
}

class SquareThread extends Thread 
{
    private int[] arr = {1, 20, 50, 15, 30};

    @Override
    public void run()
    {
        System.out.println("Squares of the numbers in the array:");
        for (int num : arr)
        {
            int square = num * num;
            System.out.println("Square of " + num + ": " + square);
        }
    }
}

public class Lab_9_ThreadExecution
{
    public static void main(String[] args)
    {
        AverageThread thread1 = new AverageThread();
        SquareThread thread2 = new SquareThread();

        thread1.start();

        try
        {
            thread1.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        thread2.start();

        try
        {
            thread2.join();
        }
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Both threads have executed one by one.");
    }
}