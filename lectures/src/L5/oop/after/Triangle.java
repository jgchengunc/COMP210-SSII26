package L5.oop.after;

public class Triangle {
    private Point _pointA;
    private Point _pointB;
    private Point _pointC;

    private static final double SIDE_EPSILON = 0.001;

    public Triangle(double pointAX, double pointAY, double pointBX,
                    double pointBY, double pointCX, double pointCY) {
        _pointA = new Point(pointAX, pointAY);
        _pointB = new Point(pointBX, pointBY);
        _pointC = new Point(pointCX, pointCY);
    }

    public String category() {
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

    public double perimeter() {
        double sideABLength = _pointA.distanceTo(_pointB);
        double sideBCLength = _pointB.distanceTo(_pointC);
        double sideACLength = _pointA.distanceTo(_pointC);

        return sideABLength + sideBCLength + sideACLength;
    }

    private static boolean closeEnough(double sideLength1, double sideLength2) {
        // Epsilon bound test for side length differences
        return Math.abs(sideLength1 - sideLength2) < SIDE_EPSILON;
    }
}
