package Tutoring;

public class StudentObject {
	private String Student;
	private int Credit;
	private double GPA; 
	
	
	public void setStudent (String student)
	{
		Student=student;
	}
	
	public void setCredit (int credit)
	{
		Credit=credit;
	}
	public void setGPA (double gpa)
	{
		GPA=gpa;
	}
	
	public String getStudent()
	{
		return Student;
	}
	
	public int getCredit()
	{
		return Credit;
	}
	
	public double getGPA()
	{
		return GPA;
	}
}
