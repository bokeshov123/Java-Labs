package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.util;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity.Student;
import java.util.Random;

public class StudentGenerator {
        private static final String[] STUDENT_NAMES = {"Talgat", "Kayrat", "Erbol", "Pasha", "Ulya", "Aigerim"};
        private static final String[] STUDENT_SURNAMES = {"Bokesh", "T", "K", "Bolt", "PS", "U"};
        private static final String[] STUDENT_ID = {"01", "02", "03", "04", "05", "06"};
        private static final String FACULTY = "FITR";
        private static final String GROUPNUMBER = "10701117";
        
        
        private static Random random = new Random();
        
        public static Student generateRandomStudent(){
            int StudentNameIndex = random.nextInt(STUDENT_NAMES.length);
            int StudentSurNameIndex = random.nextInt(STUDENT_SURNAMES.length);
            int StudentIDIndex = random.nextInt(STUDENT_ID.length);
            float StudentGPA = random.nextFloat() * 10.0f;
            
            return new Student(STUDENT_NAMES[StudentNameIndex], 
                    STUDENT_SURNAMES[StudentSurNameIndex], FACULTY,
                    GROUPNUMBER + STUDENT_ID[StudentIDIndex], StudentGPA);
        }
}
