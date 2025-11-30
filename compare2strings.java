package Assignments;
import java.util.*;

public class compare2strings {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) 
        {
            System.out.println("Using equals(): Strings are EQUAL");
        } 
        else 
        {
            System.out.println("Using equals(): Strings are NOT equal");
        }

        int result = s1.compareTo(s2);
        if (result == 0) 
        {
            System.out.println("Using compareTo(): Strings are EQUAL");
        } 
        else if (result > 0) 
        {
            System.out.println("Using compareTo(): First string is GREATER");
        } 
        else 
        {
            System.out.println("Using compareTo(): First string is SMALLER");
        }
	}
}
