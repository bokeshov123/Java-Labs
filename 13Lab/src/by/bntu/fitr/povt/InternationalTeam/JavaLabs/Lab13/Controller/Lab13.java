/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.Controller;

//import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.view.Printer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity.Group;
//import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.logic.Dekanat;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.util.StudentGenerator;


public class Lab13{
    private static final int TRIP_AMOUNT = 5;
    
    public static void main(String[] args)
    {
        Group group = new Group("10701117");             
        
        for(int i = 0; i < TRIP_AMOUNT; i++)
        {
            group.addStudent(StudentGenerator.generateRandomStudent());
        }
        
        float avrageGPA = group.countAvarageGPA();
        int countNumberOfStudents = group.size();
        
        System.out.println("The avarage GPA int the group: " + avrageGPA);
        System.out.println("Number of students in the group: " + countNumberOfStudents); 
    }
}
