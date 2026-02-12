package InClass.Generics;

public class Point3D <T extends Number> extends Point<T>{

    T z;

    Point3D(T x, T y, T z){
        super(x, y);
        this.z  = z;
    }

    public void setZ(T z){
        this.z = z;
    }
    public T getZ(){
        return z;
    }



}
