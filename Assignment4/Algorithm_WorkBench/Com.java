package Assignment4.Algorithm_WorkBench;

public class Com {
    
    public static void main(String[] args) {
        
        System.out.println(comChecker("HelloWorld.com"));

    }

    public static boolean comChecker(String string){

        if(string.toLowerCase().endsWith(".com")){
            return true;
        }
        return false;
    }

}
