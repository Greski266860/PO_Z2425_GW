import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.*;

public class Calculator {
    public double distanceX(Point a, Point b) {
        double dx = abs(a.getX() - b.getX());

        return dx;
    }

    public double distanceY(Point a, Point b) {
        double dy = abs(a.getY() - b.getY());

        return dy;
    }
    public Point middlePoint(Point a, Point b) {
        Point middle = new Point((a.getX() + b.getX())/2, (a.getY() + b.getY())/2);

        return middle;
    }


    public double distance(Point a, Point b) {
        return sqrt(pow(distanceX(a, b), 2) + pow(distanceY(a, b), 2));
    }



    public boolean isSquare(Point a, Point b, Point c, Point d) {
        double distanceAB = distance(a, b);
        double distanceAC = distance(a, c);
        double distanceAD = distance(a, d);
        Point middle;
        double dist_temp;

        if(distanceAB > distanceAC && distanceAB > distanceAD && distanceAC == distanceAD) {
            middle = middlePoint(a, b);
            dist_temp = distance(middle, a);
            if(dist_temp == distance(middle, b) && dist_temp == distance(middle, c) && dist_temp == distance(d, middle)) {
                return true;
            }
        } else if (distanceAC > distanceAB && distanceAC > distanceAD && distanceAB == distanceAD) {
            middle = middlePoint(a, c);
            dist_temp = distance(middle, a);
            if(dist_temp == distance(middle, b) && dist_temp == distance(middle, c) && dist_temp == distance(d, middle)) {
                return true;
            }
        } else if(distanceAD > distanceAB && distanceAD > distanceAC && distanceAB == distanceAC) {
            middle = middlePoint(a, d);
            dist_temp = distance(middle, a);
            if(dist_temp == distance(middle, b) && dist_temp == distance(middle, c) && dist_temp == distance(d, middle)) {
                return true;
            }
        }


        return false;
    }

}
