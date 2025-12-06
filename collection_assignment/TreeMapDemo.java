package collection_assignment;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Mango");
        map.put(2, "Orange");

        // Print map in ascending order (default)
        System.out.println("TreeMap in Ascending Order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }

        // Print map in descending order
        System.out.println("\nTreeMap in Descending Order:");
        for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }

	}
}
