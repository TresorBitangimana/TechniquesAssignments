package InClass.Generics;

public class Point <T> {
    
    T x;
    T y;

    Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    void setX(T x){
        this.x = x;
    }
    T getX(){
        return x;
    }

    void setY(T y){
        this.y = y;
    }
    T getY(){
        return y;
    }

    static String sqLength(Point<Number> p){

        double x = p.getX().doubleValue();
        double y = p.getY().doubleValue();

        return "Coordinates: "+ x*x +", " + y*y;
    }


    @Override
    public String toString() {
        return "Coordinates: "+ x+", "+y;
    }

    public static void main(String[] args) {
        
        Point<Number> p = new Point<Number>(3, 4);
        System.out.println(p.toString());
        System.out.println(sqLength(p));
    }
}
