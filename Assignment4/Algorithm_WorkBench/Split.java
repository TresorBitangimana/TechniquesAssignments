package Assignment4.Algorithm_WorkBench;

public class Split {
    public static void main(String[] args) {
        

        String string = "cookies>milk>fudge:cake:ice cream";
        String[] words = string.split("[>:]");

        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            if(i < words.length-1){
                newString.append(words[i]);
                newString.append(", ");
            }
            else{
                newString.append(words[i]);
            }
        }

        System.out.println(newString);


    }
}
