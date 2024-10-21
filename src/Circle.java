import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    protected Point center;
    protected double d;

    public Circle(Point center, double d) {
        this.center = center;
        this.d = d;
    }
    public Point getCenter(){
        return center;
    }
    public double getD(){
        return d;
    }

    public double area(){
        return PI * pow(d/2, 2);
    }
    public double circumference(){
        return PI*d;
    }
}
