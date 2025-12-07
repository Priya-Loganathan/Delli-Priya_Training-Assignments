package ExceptionHandling_assignment;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}

public class VoteCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try 
        {
            checkAge(age);
            System.out.println("Candidate is eligible to vote");
        }
        catch (InvalidAgeException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException 
    {
        if (age < 18) 
        {
            throw new InvalidAgeException("Candidate is not eligible to vote");
        }
    }
}