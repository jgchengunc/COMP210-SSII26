package L5.adt.fieldAccess.before;

// No access modifiers on fields or methods
public class Triangle {
    Point _pointA;
    Point _pointB;
    Point _pointC;

    static final double SIDE_EPSILON = 0.001;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this._pointA = pointA;
        this._pointB = pointB;
        this._pointC = pointC;
    }

    String category() {
        double sideABLength = _pointA.distanceTo(_pointB);
        double sideBCLength = _pointB.distanceTo(_pointC);
        double sideACLength = _pointA.distanceTo(_pointC);

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
        double sideABLength = _pointA.distanceTo(_pointB);
        double sideBCLength = _pointB.distanceTo(_pointC);
        double sideACLength = _pointA.distanceTo(_pointC);

        return sideABLength + sideBCLength + sideACLength;
    }

    static boolean closeEnough(double sideLength1, double sideLength2) {
        // Epsilon bound test for side length differences
        return Math.abs(sideLength1 - sideLength2) < SIDE_EPSILON;
    }
}
