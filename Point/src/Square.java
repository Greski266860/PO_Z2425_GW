import javax.swing.text.BadLocationException;
import java.awt.*;

public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Square(Point a, Point b, Point c, Point d) throws BadShapeException{
        if(a == null || b == null || c == null || d == null){
            throw new BadShapeException("Jeden z punktów nie został zdefiniowany");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;


    }

    @Override
    double area() {
        Calculator calc = new Calculator();
        if (calc.distance(a, b) < calc.distance(a, c)) {
            return Math.pow(calc.distance(a, b), 2);
        }else {
            return Math.pow(calc.distance(a, c), 2);
        }
    }
}
