/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.view.Printer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.StudentInformation;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util.UserInput;

import java.util.Scanner;
import java.text.ParseException;

public class Lab10 {

    public static void main(String[] args)throws ParseException{
	{
		Scanner scanner = new Scanner(System.in);
                
                String name = UserInput.inputInformation("Input the First Name of the Student: \n");
                String surname = UserInput.inputInformation("Input the Last Name of the Student: \n");
                String univerity = UserInput.inputInformation("Input University he/she is studying: \n");
               
		StudentInformation student = new StudentInformation(name, surname, univerity);

		String id = UserInput.inputInformation("Please, input your student id number: \n");
		String fac = UserInput.inputInformation("Please, input your faculty information: \n");

		student.setFaculty(fac);
		student.setStudentId(id);

		Printer.print(student.getName() + " is studying in " 
                    + student.getUniversity() + " University" + " in " 
                    + student.getFaculty() + " Faculty.");
	}
    }
}
