package L6.encapsulation.enscapsulated;

// Added access modifiers on fields and methods
public class Point {
    private double _x;
    private double _y;

    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other._x - _x, 2) + Math.pow(other._y - _y, 2));
    }
}