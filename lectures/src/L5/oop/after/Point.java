package L5.oop.after;

public class Point {
    private double _x;
    private double _y;

    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

    public double distanceTo(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint._x - _x, 2) + Math.pow(otherPoint._y - _y, 2));
    }
}