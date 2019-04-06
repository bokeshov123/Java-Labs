package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity;

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
    public void addStudent(Student student){
       if(this.group != null)
       {
           this.group = Arrays.copyOf(this.group, this.group.length + 1);
       }
       else{
           this.group = new Student[1];
       }
        
       this.group[this.group.length - 1] = student;
    }

    //remove particular student
    public void removeStudent(Student student){
        for(int i = 0; i < this.group.length; i++){
            if(this.group[i] == student){
                Student[]  newgroup = new Student[this.group.length - 1];
                
                System.arraycopy(this.group, 0, newgroup, 0, i);
                System.arraycopy(this.group, i + 1, newgroup, 0, newgroup.length);
                
                this.group = newgroup;
                break;
            }
        }
    }
    
    /*public void HardCode(int count){
        
        group = Arrays.copyOf(group, group.length + 1);
        group[0] = new Student("Talgat", "Bokeshov", "FITR","1070111703", 6.6f);
        
        group = Arrays.copyOf(group, group.length + 1);
        group[1] = new Student("Erbol", "Kemelov", "FITR","1070111701", 4.3f);
        
        group = Arrays.copyOf(group, group.length + 1);
        group[2] = new Student("Pasha", "Boltromyuk", "FITR","1070111702", 8.5f);
    }
    */
    
    //Calculate average GPA
    public float countAvarageGPA(){
        float avarageGPA = 0;
        
        for(Student std: this.group)
        {
            avarageGPA += std.getGPA();
        }
        
        return (avarageGPA/group.length);
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
