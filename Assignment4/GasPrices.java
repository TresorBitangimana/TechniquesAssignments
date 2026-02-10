package Assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GasPrices {
    public static void main(String[] args) throws FileNotFoundException{
        
        File file = new File("Assignment4/GasPrices.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }

    public static String averagePricePerYear(){
        
    }
}
