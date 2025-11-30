package Assignments;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) 
	{
		System.out.println("Enter the total no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element of Array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt(); 
		}
		
		System.out.println("Enter the elements to be searched for");
		int search=sc.nextInt(); 
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("The element " +search+ " is found at position " +(i+1));
				found=true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("The element " +search+ " is not found");
		}

	}

}
