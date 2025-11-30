package Assignments;
import java.util.*;

public class countwords 
{
	public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        int count = 0;
        str = str.trim();
        if (str.length() == 0) 
        {
            System.out.println("Word Count: 0");
            return;
        }
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Word Count: " + (count + 1));
    }

}
