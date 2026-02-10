package Assignment4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some sentences: ");
        String sentence = scanner.nextLine();
        scanner.close();

        System.out.println(capitalized(sentence));

    }

    public static String capitalized(String sentence){

        String newSentence = "";
        boolean toCapitalise = false;

        for(int i = 0; i < sentence.length(); i++){

            if(i == 0){
                newSentence += String.valueOf(sentence.charAt(i)).toUpperCase();
            }
            else if(sentence.charAt(i) == '.'){
                toCapitalise = true;
                newSentence += String.valueOf(sentence.charAt(i));
                i++;
            }



            //continue
            else if(!(Character.isLetter(sentence.charAt(i)))){
                newSentence += String.valueOf(sentence.charAt(i));
            }
            else if(Character.isLetter(sentence.charAt(i))){
                
            }
            else{
                newSentence += String.valueOf(sentence.charAt(i));
            }
        }

        return newSentence;
    }

}
