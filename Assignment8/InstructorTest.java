package Assignment8;

public class InstructorTest {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("josh", "A1231");
        Instructor instructor2 = new Instructor("joy", "A1232");
        Instructor instructor3 = new Instructor("jody", "A1233");
        Instructor instructor4 = new Instructor("joz", "A1234");
        Instructor instructor5 = new Instructor("joe", "A1235");

        InstructorSet instructorSet = new InstructorSet();

        instructorSet.addInstructor(instructor1);
        instructorSet.addInstructor(instructor2);
        instructorSet.addInstructor(instructor3);
        instructorSet.addInstructor(instructor4);
        instructorSet.addInstructor(instructor5);

        instructorSet.display();

        Instructor instructor6 = new Instructor("josh", "A1231");

        instructorSet.search(instructor1);
        instructorSet.search(instructor6);
    }
}
