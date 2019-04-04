package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.entity;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util.UserInput;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util.Initialization;
import java.util.Arrays;

public class Group {
    
    private String number; //номер группы
    private Student[] group; 

    public Group() {
        group = new Student[0];
    }
   
    public Group(Student[] group) {
        this.group = group;
    } 
    
    public Group(String name) {
        this.number = name;
        this.group = new Student[0];
    }
    
    //конструктор копирования
     public Group(Group group1) {
        number = group1.number;
        group = Arrays.copyOf(group1.group, group1.group.length);
    }
     
    public String getNumber() {
        return number;
    }

    public void setNumber(String name) {
        this.number = name;
    }
    
    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }
    
    
    //add new student
    public void add(){
       group = Arrays.copyOf(group, group.length + 1);
       
       UserInput.inputStr("");
       String Name = UserInput.inputStr("Enter the first name of the student:");
       String Surname = UserInput.inputStr("Enter the surname of the student:");
       String Faculty = UserInput.inputStr("Enter the faculty of the student:");
       String studentID = UserInput.inputStr("Enter the ID of the student:");
       float GPA = UserInput.inputFloat("Enter the GPA of the student: ");
       group[group.length - 1] = new Student(Name, Surname, Faculty,studentID, GPA);
    }

    //remove particular student
    public void remove(){
        UserInput.inputStr("");
        String studentID = UserInput.inputStr("Enter the Id of the student: ");
        
        for(int i = 0; i < group.length; i++)
        {
            if(group[i].getStudentId().equals(studentID))
            {
                for(int j = i; j < group.length - 1; j++)
                {
                    group[j] = group[j + 1];
                }
                
                group = Arrays.copyOf(group, group.length - 1);
                break;
            }
            
        }
    }
    
    public void HardCode(int count){
        
        group = Arrays.copyOf(group, group.length + 1);
        group[0] = new Student("Talgat", "Bokeshov", "FITR","1070111703", 6.6f);
        
        group = Arrays.copyOf(group, group.length + 1);
        group[1] = new Student("Erbol", "Kemelov", "FITR","1070111701", 4.3f);
        
        group = Arrays.copyOf(group, group.length + 1);
        group[2] = new Student("Pasha", "Boltromyuk", "FITR","1070111702", 8.5f);
    }
    
    //get(index)
    public Student get(int index){
        return group[index];
    }
    
    //get size
    public int size(){
       return group.length;
    }
    
    //To String 
    @Override
    public String toString(){
       StringBuilder builder = new StringBuilder("\nList of all student:\n");
       
        for (Student groups : group) {
            builder.append(groups.toString()).append("\n");
        }
       
       return builder.toString();
    }
}
