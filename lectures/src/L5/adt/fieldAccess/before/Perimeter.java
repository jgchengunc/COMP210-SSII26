package L5.adt.fieldAccess.before;

// Accesses object fields directly (dangerous!)
public class Perimeter {
	public static void main (String[] args) {
		Point p1 = new Point(5, 5);
		Point p2 = new Point(10, 15);
		Point p3 = new Point(15, -2);
		Point p4 = new Point(-3, -8);

		Triangle t1 = new Triangle(p1, p2, p3);
		Triangle t2 = new Triangle(p2, p3, p4);
		
		System.out.println("Perimeter of T1 = " + t1.perimeter());
		System.out.println("Perimeter of T2 = " + t2.perimeter());

		t1._a._x += 5;
		t1._b._x += 5;
		t1._c._x += 5;
		
		System.out.println("Perimeter of T1 = " + t1.perimeter());
		System.out.println("Perimeter of T2 = " + t2.perimeter());
				
		t1._a = t1._c;
		t1._b = t1._c;
		
		System.out.println("Perimeter of T1 = " + t1.perimeter());
		System.out.println("Perimeter of T2 = " + t2.perimeter());		
	}
}
