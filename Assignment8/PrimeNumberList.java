package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {
    public static void main(String[] args) {

        List<Integer> primeList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i == j) {
                    primeList.add(i);
                }
            }
        }

        System.out.println(primeList.toString());

    }
}
