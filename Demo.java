package MyPackage;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        // Create Stack
        Stack<Integer> stack = new Stack<>();
        
        // Check if empty
        System.out.println("Is stack empty? " + stack.empty());
        
        // Push elements
        stack.push(78);
        stack.push(113);
        stack.push(90);
        stack.push(120);
        
        // Print stack
        System.out.println("Stack elements: " + stack);
        
        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());
        
        // Pop element
        System.out.println("Removed element (pop): " + stack.pop());
        
        // Print stack again
        System.out.println("Stack after pop: " + stack);
        
        // Search element
        System.out.println("Position of 78 (from top): " + stack.search(78));
    }
}