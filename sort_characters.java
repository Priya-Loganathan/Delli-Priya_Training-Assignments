package Assignments;
import java.util.*;

public class sort_characters {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] arr = str.toCharArray(); 
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println("Sorted characters: " + sorted);
	}
}
