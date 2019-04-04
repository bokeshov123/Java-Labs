/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.view.Printer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.entity.Group;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.logic.Dekanat;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util.UserInput;

import java.text.ParseException;

public class Lab10 {

    public static void main(String[] args)throws ParseException{
    {
            boolean notExit = true;
            int choice;

            String GroupNumber = UserInput.inputStr("Enter the number of the group:");
            Group group = new Group(GroupNumber);
            group.HardCode(3);
            
            while(notExit)
            {
                Printer.print("\n1.List of students.\n2.Add new Student.\n3.Remove Student.\n"
                        + "4.Find the best Student.\n5.Find the worst student."
                        + "\n6.Find a student by his/her student ID number\n0.Exit");
            
                choice = UserInput.inputInt("\nSelect menu item:");

                switch(choice){
                //List of all availible students
                    case 1:  
                        Printer.print(group);
                        break;
                //Add new Student
                    case 2:  
                        group.add();
                        break;
                //Remove a student
                    case 3:  
                        group.remove();
                        break;
                //Find the best student by GPA(in dekanat class)
                    case 4: 
                        Printer.print(Dekanat.BestStudentByGPA(group) + "\n");
                        break;
                //Find the worst student by GPA(in dekanat class)
                    case 5:
                        Printer.print(Dekanat.WorstStudentByGPA(group) + "\n");
                        break;
                //Find a student by his/her student ID number(in dekanat class)
                    case 6: 
                        UserInput.inputStr("");
                        String ID = UserInput.inputStr("Enter student ID: "); 
                        Dekanat.searchByID(group, ID);
                        break;
                    case 0: notExit = false; break;
                }
            }        
             
	}
                        
    }
}
