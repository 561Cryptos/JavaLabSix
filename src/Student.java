import java.time.Year;

public class Student 
{
	public String name; 
	public String zNumber; 
	public String major; 
	public double gpa; 
	public int birthYear; 
	public int credits; 
	
	public void initialize(String studentName, String studentZNumber, String studentMajor, double studentGPA, int studentBirthYear, int studentCredits)
	{
		studentName = name;
		studentZNumber = zNumber;
		studentMajor = major;
		studentGPA = gpa;
		studentBirthYear = birthYear;
		studentCredits =  credits;
		
	}
	public void studentAge()
	{
		int year = Year.now().getValue();
		int age = year - birthYear;
		System.out.println(name+" is " +age);
		
	}
	public void studentYear()
	{
		if(credits<30)
			System.out.println("FRESHMAN");
		else if(credits<60)
			System.out.println("SOPHOORE");
		else if(credits<90)
			System.out.println("JUNIOR");
		else
			System.out.println("Senior");
	}
	public void studentProfile()
	{
		System.out.println("Name: "+name);
		System.out.println("Z Number: " +zNumber);
		System.out.println("Major: "+major);
		System.out.println("GPA: " +gpa);
		
	}
	
	
	
	
	
	
	
	
	

}
