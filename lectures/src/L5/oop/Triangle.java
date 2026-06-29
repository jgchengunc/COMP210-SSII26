package L5.oop;

public class Triangle {
    private Point _a;
    private Point _b;
    private Point _c;

    private static final double SIDE_EPSILON = 0.001;

    public Triangle(double ax, double ay, double bx,
                    double by, double cx, double cy) {
        _a = new Point(ax, ay);
        _b = new Point(bx, by);
        _c = new Point(cx, cy);
    }

    public String category() {
        double sideABLength = _a.distanceTo(_b);
        double sideBCLength = _b.distanceTo(_c);
        double sideACLength = _a.distanceTo(_c);

        if (closeEnough(sideABLength, sideBCLength) &&
            closeEnough(sideBCLength, sideACLength)) {
            return "equilateral";
        } else if (closeEnough(sideABLength, sideBCLength) ||
                 closeEnough(sideBCLength, sideACLength) ||
                 closeEnough(sideABLength, sideACLength)) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public double perimeter() {
        double sideABLength = _a.distanceTo(_b);
        double sideBCLength = _b.distanceTo(_c);
        double sideACLength = _a.distanceTo(_c);

        return sideABLength + sideBCLength + sideACLength;
    }

    private static boolean closeEnough(double side1Length, double side2Length) {
        // Epsilon bound test for side length differences
        return Math.abs(side1Length - side2Length) < SIDE_EPSILON;
    }
}
