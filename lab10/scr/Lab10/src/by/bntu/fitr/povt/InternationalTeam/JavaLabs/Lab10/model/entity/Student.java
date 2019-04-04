/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.model.entity;


public class Student extends Man{
    
    private String faculty;
    private String studentId;
    private float GPA;

    // создаем конструктор
    public Student(String name, String surname, String faculty,
            String studentId, float GPA){
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.studentId = studentId;
        this.GPA = GPA;
    }

    //конструктор копирования
    public Student(Student student1)
    {
        name = student1.name;
        surname = student1.surname;
        faculty = student1.faculty;
        studentId = student1.studentId;
        GPA = student1.GPA;
    }     
    
    //getter and setter

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public float getGPA()
    {   
        return GPA;
    }
    
    public void setGPA(float GPA)
    {
        this.GPA = GPA;
    }

    //Консультант консультирует Менаджер продаёт
    @Override
    public String toString() {
        return "Student{\nName: " + name + "\nSurname: " + surname + "\nStudent ID: " + studentId
                 + "\nFaculty: " + faculty + "\nGPA: " + GPA + "\n}";
    }
}
