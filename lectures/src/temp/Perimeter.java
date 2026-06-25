package temp;

public class Perimeter {

    public static void main(String[] args) {

        // Initial Non-OOP Example
        double pointAX = 0.0;
        double pointAY = 0.0;
        double pointBX = 2.0;
        double pointBY = 3.0;
        double pointCX = 4.0;
        double pointCY = 0.0;

        double lineABLength = Math.sqrt(Math.pow(pointBX - pointAX, 2) + Math.pow(pointBY - pointAY, 2));
        double lineACLength = Math.sqrt(Math.pow(pointCX - pointAX, 2) + Math.pow(pointCY - pointAY, 2));
        double lineBCLength = Math.sqrt(Math.pow(pointCX - pointBX, 2) + Math.pow(pointCY - pointBY, 2));

        double perimeter = lineABLength + lineACLength + lineBCLength;

        System.out.println("Perimeter: " + perimeter);

        // Using Point class
        Point a = new Point(0.0, 0.0);
        Point b = new Point(2.0, 3.0);
        Point c = new Point(4.0, 0.0);

        lineABLength = a.distanceTo(b);
        lineACLength = a.distanceTo(c);
        lineBCLength = b.distanceTo(c);

        perimeter = lineABLength + lineACLength + lineBCLength;

        System.out.println("Perimeter: " + perimeter);

        // Using Triangle class
        Triangle triangle = new Triangle(0.0, 0.0, 2.0, 3.0, 4.0, 0.0);
        // perimeter = triangle.findPerimeter();

        System.out.println("Perimeter: " + perimeter);

    }
}