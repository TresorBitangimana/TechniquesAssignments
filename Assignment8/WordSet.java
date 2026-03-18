package Assignment8;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class WordSet {
    
    public static void main(String[] args) {
        
        LinkedHashSet<String> list = new LinkedHashSet<>(); //creates a LinkedHashset instance that 
                                                            //accepts Strings its argumanets
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = scanner.nextLine();
        scanner.close();

        String[] lineToken = line.split(" "); //splits the line into tokens

        for(int i = 0; i < lineToken.length; i++){ 
            list.add(lineToken[i]);
        }
        System.out.println(list); //prints the tokenized line with only unique elements

    }
}
