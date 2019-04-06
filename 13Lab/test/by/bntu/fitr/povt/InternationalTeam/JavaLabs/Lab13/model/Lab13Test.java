package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity.Group;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity.Student;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.logic.Dekanat;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lab13Test {
    private Group group;
    
    @Before
    public void createGroup(){
        group = new Group("Test");
    }
    
    @After
    public void clearTestData(){
        group = null;
    }
    
    @Test
    public void TestAddStudentWithValidData(){
        Student student1 = new Student("Talgat", "Bokeshov", "FITR", "1070111703", 6.2f);
        Student student2 = new Student("Kayrat", "Talantbekov", "FITR", "1070111702", 9.8f);
        
        group.addStudent(student1);
        group.addStudent(student2);
        
        Assert.assertEquals(2, this.group.getGroup().length);
    }
    
    @Test
    public void TestAvarageGPA(){
        Student student1 = new Student("Talgat", "Bokeshov", "FITR", "1070111703", 6.2f);
        Student student2 = new Student("Kayrat", "Talantbekov", "FITR", "1070111702", 9.8f);
        Student student3 = new Student("Kamelov", "Erbol", "FITR", "1070111701", 5.6f);
        
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        
        Assert.assertEquals(7.2000003f, this.group.countAvarageGPA(), 0.0f);
    }    
    
    @Test
    public void TestHighestGPA(){
        Student student1 = new Student("Talgat", "Bokeshov", "FITR", "1070111703", 6.2f);
        Student student2 = new Student("Kayrat", "Talantbekov", "FITR", "1070111702", 9.8f);
        Student student3 = new Student("Kamelov", "Erbol", "FITR", "1070111701", 5.6f);
        
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student2);
        
        Assert.assertEquals(9.8f, Dekanat.BestStudentByGPA(this.group), 0.0f);
    }    
}
