package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util.Student;

// наследуем класс Man
public class Student extends Man{

    //Const
    //constructors
    //getter setter
    //ToString

    //static block initialization
    private static int count = getCount();
    
    /*
    public static int getCount(){
        System.out.println("static int block 1");
        return 0;
    }
    */
    
    /*
    static{
        System.out.println("static int block 2");  
    }
    */
    private String university;
    private String faculty;
    private StudentId studentId;
    private String number;

    //блок инициализации
   /*
    {
        System.out.println("Dinamic block initialization...");
    }
    */

    /*
    public Student(){
             System.out.println("default constructor...");
    } 
    */

    // создаем конструктор
    public Student(String n, String s, String p){
        this.name = n;
        this.surname = s;
        this.university = p;
    }

//конструктор копирования
   /* public Student(Student student1)
    {
        name = student1.name;
        surname = student1.surname;
        university = student1.university;  
    }
    */
    public StudentId(String n){
        number = n;
    }
    
    public void setNumber(String newNumber){
        number = newNumber;
    }
    
    public String getNumber(){
        return number;
    }

    public void setUniversity(String newUni){
        university = newUni;
    }

    public String getUniversity(){
        return university;
    }

    public void setFaculty(String newFac){
        faculty = newFac;
    }

    public String getFaculty(){
        return faculty;
    }

    public void setStudentId(StudentId s){
        studentId = s;
    }

    public StudentId getStudentId(){
        return studentId;
    }

    public String ToString(){
        return "Student{" + name + "\nUniversity: " + university + "\n Student ID: " + studentId + "\nFaculty: " + faculty + "}";
    }
}