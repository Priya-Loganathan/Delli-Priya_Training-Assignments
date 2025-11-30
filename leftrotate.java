package Assignments;
import java.util.*;

public class leftrotate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of rotations:");
        int r = sc.nextInt();
        r = r % n;
        for (int i = 0; i < r; i++) 
        {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) 
            {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

	}

}
