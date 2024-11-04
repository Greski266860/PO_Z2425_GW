public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c)throws BadShapeException{
        if(a == null || b == null || c == null){
            throw new BadShapeException("Jeden z punktów nie został zdefiniowany");
        }
        this.a = a;
        this.b = b;
        this.c = c;


    }
    @Override
    double area() {
        Calculator calc = new Calculator();
        return (calc.distanceX(a, b)* calc.distanceY(a, c)- calc.distanceX(a, c)*calc.distanceY(a, b))/2;
    }
}
