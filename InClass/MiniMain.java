package InClass;

public class MiniMain extends Main{

    private int num1;

    MiniMain(int num1, int num2){
        super(num1);
        System.out.println(num1+num2);
    }

    public void setNum1(int number){
        num1 = number;
    }

}