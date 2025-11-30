package Assignments;
import java.util.*;

public class removeduplicates {

	public static void main(String[] args) 
	{
		System.out.println("Enter the total no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array");
        
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Unique elements:");
        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] != arr[i - 1]) 
            {
                System.out.print(arr[i] + " ");
            }    
        }   
	}

}
