package L6.encapsulation.nonEncapsulated;

// No access modifiers on fields or methods
public class Triangle {
    Point _a;
    Point _b;
    Point _c;

    static final double SIDE_EPSILON = 0.001;

    public Triangle(Point a, Point b, Point c) {
        this._a = a;
        this._b = b;
        this._c = c;
    }

    String category() {
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

    double perimeter() {
        double sideABLength = _a.distanceTo(_b);
        double sideBCLength = _b.distanceTo(_c);
        double sideACLength = _a.distanceTo(_c);

        return sideABLength + sideBCLength + sideACLength;
    }

    static boolean closeEnough(double side1Length, double side2Length) {
        // Epsilon bound test for side length differences
        return Math.abs(side1Length - side2Length) < SIDE_EPSILON;
    }
}
