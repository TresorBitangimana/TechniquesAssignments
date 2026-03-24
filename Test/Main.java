package Test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new LinkedList<>();
        ListIterator<?> it = myList.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
