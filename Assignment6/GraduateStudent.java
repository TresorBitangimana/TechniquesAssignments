package Assignment6;

public class GraduateStudent extends Student<String>{

    private String thesisTitle;

    GraduateStudent(String id, String name, double gpa, String thesisTitle){
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;

    }


    @Override
    public void displayInfo(){
        System.out.println(
            "Name: "+name+" Role: Student \nID: "+id+" \nGPA: "+gpa+ " \nthesisTitle: " + thesisTitle
        );
        
    }
}