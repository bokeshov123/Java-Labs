package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util.Student;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.view.Printer;

import java.util.Scanner;
import java.text.ParseException;

public class lab10Main{
	public static void main(String[] args)throws ParseException{
	{
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Please, input your name:");
		String name1 = scanner.nextLine();

		System.out.println("Please, input your Surname:");
		String name2 = scanner.nextLine();

		System.out.println("Where are you studying:");
		String uni = scanner.nextLine();

		Student student1 = new Student(name1, name2, uni);

		System.out.println("Please, input your student id number");
		String id = scanner.nextLine();		

		StudentId card = new StudentId(id);

		System.out.println("Please, input your faculty information");
		String fac = scanner.nextLine();

		student.setFaculty(fac);
		student.setStudentId(card);

		Printer.print(student1.getName() + " is studying in " + student1.getUniversity() + " University");
	}
}
}