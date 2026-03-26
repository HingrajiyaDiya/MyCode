package MyPackage;

import java.util.Stack;

public class Lab_6_Stack
{
    public static void main(String[] args) 
    {

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 10; i++) 
        {
            stack.push(i);
        }

        System.out.println("Stack after pushing 10 elements:");
        System.out.println(stack);

        for (int i = 1; i <= 4; i++) 
        {
            stack.pop();
        }

        System.out.println("Stack after removing 4 elements:");
        System.out.println(stack);
    }
}
