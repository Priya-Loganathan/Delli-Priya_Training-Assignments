package collection_assignment;

import java.util.Vector;

public class Demonstrate_Vector {

	public static void main(String[] args) 
	{
		// Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Mango");

        // Insert at specific index
        vector.add(2, "Orange");

        // Display Vector
        System.out.println("Vector elements: " + vector);

        // Access element
        System.out.println("Element at index 1: " + vector.get(1));

        // Remove element
        vector.remove("Banana");
        System.out.println("After removing 'Banana': " + vector);

        // Size of vector
        System.out.println("Size of Vector: " + vector.size());

        // Check if element exists
        System.out.println("Contains Mango? " + vector.contains("Mango"));

        // Iterate using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String item : vector) 
        {
            System.out.println(item);
        }

        // Iterate using enumeration (Vector special feature)
        System.out.println("\nIterating using Enumeration:");
        java.util.Enumeration<String> e = vector.elements();
        while (e.hasMoreElements()) 
        {
            System.out.println(e.nextElement());
        }
	}
}
