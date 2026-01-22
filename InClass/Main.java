package InClass;

public abstract class Main{

    private int number = 10;

    Main(int num1){
        System.out.println(num1);
    }

    public static void main(String[] args) {
        
        Main main = new Mini2Main(1, 2, 3);
        System.out.println(main);

    }

    public abstract void setNum1(int number);

}