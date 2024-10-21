//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    Calculator calc = new Calculator();
    System.out.println("punkt 1: " + p1.getX() + " - " + p1.getY() + ", punkt 2: " + p2.getX() + " - " + p2.getY());
    System.out.println("dystans: " + calc.distance(p1, p2));
    System.out.println("dystansX: " + calc.distanceX(p1, p2));
    System.out.println("dystansY: " + calc.distanceY(p1, p2));

    Point p3 = new Point(5, 5);
    Circle circle = new Circle(p3, 5);
    System.out.println("\nCircle center: " + circle.getCenter().getX() + " - " + circle.getCenter().getY());
    System.out.println("Circle area: " + circle.area());
    System.out.println("Circle circumference: " + circle.circumference());

    Point ps1 = new Point(0, 0);
    Point ps2 = new Point(3, 3);
    Point ps3 = new Point(3, 0);
    Point ps4 = new Point(0, 3);
    System.out.println(calc.isSquare(ps1, ps2, ps3, ps4));



    }
}