package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Aime");
        names.add("Aaron");
        names.add("Tom");
        Predicate<String> condition = s -> s.charAt(0) == 'A';

        System.out.println(names);
        System.out.println(CollectionFilter.filterList(names, condition));
    }
}
