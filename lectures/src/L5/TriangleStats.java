package L5;

// Initial Non-OOP example
public class TriangleStats {
    public static void main(String[] args) {
        double pointAX = 0.0;
        double pointAY = 0.0;
        double pointBX = 2.0;
        double pointBY = 3.0;
        double pointCX = 4.0;
        double pointCY = 0.0;

        String category = triangleCategory(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
        System.out.println("Category: " + category);
        double perimeter = trianglePerimeter(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
        System.out.println("Perimeter: " + perimeter);
    }

    public static String triangleCategory(double pointAX, double pointAY, double pointBX,
                                          double pointBY, double pointCX, double pointCY) {
        double sideABLength = pointDistance(pointAX, pointAY, pointBX, pointBY);
        double sideBCLength = pointDistance(pointBX, pointBY, pointCX, pointCY);
        double sideACLength = pointDistance(pointAX, pointAY, pointCX, pointCY);

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

    public static double trianglePerimeter(double pointAX, double pointAY, double pointBX,
                                          double pointBY, double pointCX, double pointCY) {
        double sideABLength = pointDistance(pointAX, pointAY, pointBX, pointBY);
        double sideBCLength = pointDistance(pointBX, pointBY, pointCX, pointCY);
        double sideACLength = pointDistance(pointAX, pointAY, pointCX, pointCY);

        return sideABLength + sideBCLength + sideACLength;
    }

    private static boolean closeEnough(double side1Length, double side2Length) {
        // Epsilon bound test for side length differences
        return Math.abs(side1Length - side2Length) < 0.001;
    }

    private static double pointDistance(double point1X, double point1Y, double point2X, double point2Y) {
        return Math.sqrt(Math.pow(point2X - point1X, 2) + Math.pow(point2Y - point1Y, 2));
    }
}