package temp;

public class Triangle {
    Point _pointA;
    Point _pointB;
    Point _pointC;

    static final double SIDE_EPSILON = 0.001;

    public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        _pointA = new Point(ax, ay);
        _pointB = new Point(bx, by);
        _pointC = new Point(cx, cy);
    }

    public double category() {
        double lineABLength = _pointA.distanceTo(_pointB);
        double lineACLength = _pointA.distanceTo(_pointC);
        double lineBCLength = _pointB.distanceTo(_pointC);

        return lineABLength + lineACLength + lineBCLength;

    }

    static boolean closeEnough(double sideLength1, double sideLength2) {
        // Epsilon bound test for side distances
        return Math.abs(sideLength1 - sideLength2) < SIDE_EPSILON;
    }
}
