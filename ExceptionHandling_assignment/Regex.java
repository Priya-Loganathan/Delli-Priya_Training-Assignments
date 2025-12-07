package ExceptionHandling_assignment;

public class Regex {

	public static void main(String[] args) 
	{
		String regex = "^(001|\\+1)-\\d{3}-\\d{3}-\\d{4}$";

        String p1 = "001-765-989-3421";
        String p2 = "+1-456-765-9345";

        System.out.println(p1 + " : " + p1.matches(regex));
        System.out.println(p2 + " : " + p2.matches(regex));

	}

}
