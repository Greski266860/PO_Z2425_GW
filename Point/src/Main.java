//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Point p1 = null;
    Point p2 = new Point(3, 4);
    Calculator calc = new Calculator();

    try{
        Circle c = new Circle(p1, 2);
    } catch (BadShapeException e) {
        System.out.println(e.getMessage());
    } finally{
        System.out.println("Zakończono test");
    }


    try{
        Circle c2 = new Circle(p2, 0.5);
    }catch (BadShapeException e){
        System.out.println(e.getMessage());
    } finally{
        System.out.println("Zakończono test");
    }
}
}