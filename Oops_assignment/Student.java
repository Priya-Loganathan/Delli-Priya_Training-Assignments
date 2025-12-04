package Oops_assignment;

class Student
{
	private String sName;
	private int sRollno;
	private int sMarks;
	
	public String getsName() 
	{
		return sName;
	}
	public int getsRollno() 
	{
		return sRollno;
	}
	public int getsMarks() 
	{
		return sMarks;
	}
	
	public void setsName(String sName) 
	{
		this.sName=sName;
		
	}
	public void setsRollno(int sRollno) 
	{
		this.sRollno=sRollno;
		
	}
	public void setsMarks(int sMarks) 
	{
		if(sMarks>=0 && sMarks<=100) 
		{
			this.sMarks=sMarks;
			
		}
		else 
		{
			System.out.println("Marks must be between 0 and 100");
		}
	}

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setsName("Delli Priya L");
        s.setsRollno(100);
        s.setsMarks(95);
        System.out.println("Name: " + s.getsName());
        System.out.println("Roll No: " + s.getsRollno());
        System.out.println("Marks: " + s.getsMarks());
	}
}