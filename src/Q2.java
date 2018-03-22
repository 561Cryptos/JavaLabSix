
public class Q2 
{
	
	public static void main(String[] args)
	{
	Student s1 = new Student();
	s1.name = "Hassan Imam";
	s1.zNumber = "Z23264035";
	s1.major = "Computer Science";
	s1.gpa = 3.50;
	s1.birthYear = 1994;
	s1.credits = 110;
	s1.initialize(s1.name, s1.zNumber, s1.major, s1.gpa,  s1.birthYear, s1.credits);
	s1.studentAge();
	
	s1.studentProfile();
	
	s1.studentYear();
	
	System.out.println("");
	
	Student s2 = new Student();
	s2.name = "Kevin Williams";
	s2.zNumber = "Z23263432";
	s2.major = "CIvil Engineering";
	s2.gpa = 3.20;
	s2.birthYear = 1990;
	s2.credits = 11;
	s2.initialize(s2.name, s2.zNumber, s2.major, s2.gpa,  s2.birthYear, s2.credits);
	s2.studentAge();
	s2.studentProfile();
	s2.studentYear();
	
	
	}
	
	
	
	
	
	

}
