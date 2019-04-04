package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.logic;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.entity.Student;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.entity.Group;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.view.Printer;

public class Dekanat {
  
    //The Best Student by GPA
    public static Student BestStudentByGPA(Group group){
        float max = group.getGroup()[0].getGPA();
        Student maxGPA = group.getGroup()[0];
        
        for(Student student : group.getGroup()){
            if(max < student.getGPA()){
                max = student.getGPA();
                maxGPA = student;
            }
        }
      
        return maxGPA;
    }
    
    //The worst Student by GPA
    public static Student WorstStudentByGPA(Group group){
        float min = group.getGroup()[0].getGPA();
        Student minGPA = group.getGroup()[0];
        
        for(Student student : group.getGroup()){
            if(min > student.getGPA()){
                min = student.getGPA();
                minGPA = student;
            }
        }
      
        return minGPA;
    }
    
    
    //search for specific student by student ID number
    public static void searchByID(Group group, String ID){
        
        for (int i = 0; i < group.size(); i++) {
           if(group.get(i).getStudentId().equals(ID)){
                Printer.print("\n" + group.get(i) + "\n");
            }
        }
    }
}
