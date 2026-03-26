package MyPackage;

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeExample 
{
	public static void main(String[] args) 
	{
		
		Deque<String> dq = new ArrayDeque<>();
		dq.addFirst("Diya");
		dq.addLast("Hingrajiya");
		dq.add("Nileshbhai"); 
		dq.addFirst("Miss");
		System.out.println("Deque Elements: " + dq);
		System.out.println("Removed from Front: " +
		dq.removeFirst());
		System.out.println("Removed from End: " +
		dq.removeLast());
		System.out.println("First Element: " + dq.peekFirst());
		System.out.println("Last Element: " + dq.peekLast());
		System.out.println("Final Deque: " + dq);
	}
}
