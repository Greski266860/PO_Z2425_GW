import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape {
    protected Point center;
    protected double d;

    public Circle(Point center, double d) throws BadShapeException{
        if (center == null) {
            throw new BadShapeException("Punkt centralny nie został zdefiniowany");
        }
        else if (d < 1) {
            throw new BadShapeTwoException("Średnica mniejsza niż 1");
        }
        else{
            this.center = center;
            this.d = d;
        }

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
