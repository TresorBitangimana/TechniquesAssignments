package InClass;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        IntStream nums = Arrays.stream(numbers);
        // for(int n : numbers){
        // System.out.println(n);
        // }

        nums.forEach(s -> {
            System.out.println(s);
        });

        Random random = new Random();

        IntStream infRandom = random.ints(0, 10);

        int[] evenRandomArr = infRandom
                .peek(x -> {
                    System.out.println("num: " + x);
                })
                .filter(x -> x % 2 == 0)
                .limit(5)
                .toArray();
        System.out.println(Arrays.toString(evenRandomArr));

    }
}
