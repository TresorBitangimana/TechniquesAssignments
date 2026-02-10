package InClass;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        
        ArrayList content = new ArrayList<>();

        content.add("Hello World");
        content.add(1);
        content.add(true);

        for(int i = 0; i < content.size(); i ++){
            System.out.println(content.get(i));
        }


        ArrayList<Number> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(1.01);
        numbers.add(.9238759328);

        System.out.println(numbers);






    }
}