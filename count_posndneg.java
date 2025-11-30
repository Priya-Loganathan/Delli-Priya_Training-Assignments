package Assignments;
import java.util.*;

public class count_posndneg 
{
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

        int positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > 0)
                positive++;
            else if (arr[i] < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive Count: " + positive);
        System.out.println("Negative Count: " + negative);
        System.out.println("Zero Count    : " + zero);
    }

}
