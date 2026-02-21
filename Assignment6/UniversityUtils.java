package Assignment6;

import java.util.ArrayList;

public class UniversityUtils {
    
    public static void printStudents(ArrayList<? extends Student<?>> list){
        for(Student<?> student: list){
            student.displayInfo();
        }   
    }

    public static  void addGraduateStudent(ArrayList<? super GraduateStudent> list){
        list.add(new GraduateStudent("G999", "New Grad", 4.0, "AI Research"));
    }

    public static void printIds(ArrayList< ? extends Identifiable<?>> list){
        for(Identifiable<?> i : list){
            System.out.println(i.getId());
        }
    }

    public static  <T extends Person<?>> void printPerson(T person){
        person.displayInfo();
    }
}
