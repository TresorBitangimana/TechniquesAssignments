package InClass;

public class Mini2Main extends MiniMain {
    
    private int num1;

    Mini2Main(int num1, int num2, int num3){
        super(num1, num2);
        System.out.println(num1+num2+num3);
    }

    public void setNum1(int number){
        num1 = number;
    }

}
