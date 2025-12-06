package collection_assignment;

import java.util.Stack;

public class Demonstrate_Stack {

	public static void main(String[] args) 
	{
		// Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements into the stack
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Yellow");

        // Display stack
        System.out.println("Stack elements: " + stack);

        // Peek (top element)
        System.out.println("Top element (peek): " + stack.peek());

        // Pop an element
        System.out.println("Popped: " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Search element (returns position from top)
        System.out.println("Position of 'Green': " + stack.search("Green"));

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Iterate using for-each
        System.out.println("\nIterating stack elements:");
        for (String item : stack) 
        {
            System.out.println(item);
        }
	}
}
