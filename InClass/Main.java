package InClass;

public class Main{
    public static void main(String[] args) {
        
        Person person = new Student("John", 19, "28037456");


        Person[] people = {new Student("kin", 20, "80273456"),
                            new ComputerScienceStudent("Josh", 17, "8672945")
        };

        for(int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }
    }
}