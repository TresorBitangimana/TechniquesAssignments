package Assignment6;

public class Main {
    public static void main(String[] args) {

        Student<Integer> student = new Student<Integer>(123456789, "john", 3.8);
        GraduateStudent gStudent = new GraduateStudent("987654321", "David", 4.0, "AI researcher");

        Course<String, GraduateStudent> course = new Course<>("A12345");

    }
}
