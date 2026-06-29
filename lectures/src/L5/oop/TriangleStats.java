package L5.oop;

// OOP version
public class TriangleStats {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(0.0, 0.0, 2.0, 3.0, 4.0, 0.0);

        String category = triangle.category();
        System.out.println("Category: " + category);
        double perimeter = triangle.perimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}