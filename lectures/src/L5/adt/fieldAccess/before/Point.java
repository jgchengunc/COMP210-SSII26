package L5.adt.fieldAccess.before;

// No access modifiers on fields or methods
public class Point {
    double _x;
    double _y;

    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

    double distanceTo(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint._x - _x, 2) + Math.pow(otherPoint._y - _y, 2));
    }
}