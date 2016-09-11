package Tutoring;

import java.util.Scanner;
public class StudentTest {
	public static void main (String [] ags)
	{
		Scanner input = new Scanner(System.in);
		
		StudentObject student1=new StudentObject();
		
		System.out.print("Student name: ");
		String studentName1=input.nextLine();
		student1.setStudent(studentName1);
		
		System.out.print("Enter student's GPA: ");
		double studentGPA1=input.nextInt();
		student1.setGPA(studentGPA1);
		
		System.out.print("Enter student's credit: ");
		int studentCredit1=input.nextInt();
		student1.setCredit(studentCredit1);
		
		if (studentGPA1>=2 && studentCredit1>=120)
			System.out.print("This student can graduate AUIS \n");
		
		else System.out.print("This student cannot graduate AUIS \n");






		System.out.print("Student name: ");
		studentName1 = input.next();
		student1.setStudent(studentName1);

		System.out.print("Enter student's GPA: ");
		studentGPA1=input.nextInt();
		student1.setGPA(studentGPA1);

		System.out.print("Enter student's credit: ");
		studentCredit1=input.nextInt();
		student1.setCredit(studentCredit1);

		if (studentGPA1>=2 && studentCredit1>=120)
			System.out.print("This student can graduate AUIS \n");

		else System.out.print("This student cannot graduate AUIS \n");
	
	//	StudentObject student3=new StudentObject();
	//	StudentObject student4=new StudentObject();
	//	StudentObject student5=new StudentObject();

		
			

		
	}

}
