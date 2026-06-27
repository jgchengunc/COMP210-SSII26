package L5.adt.twoInterfaces;

public class PointTriangle implements Triangle {
	private Point _a;
	private Point _b;
	private Point _c;

	private static final double AREA_EPSILON = 0.00001;
	
	public PointTriangle(Point a, Point b, Point c) {
		this._a = a;
		this._b = b;
		this._c = c;

		if (checkColinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point getA() {
		return _a;
	}

	public void setA(Point p) {
		if (p.equals(_b) || p.equals(_c)) {
			throw new RuntimeException("Attempting to set point A to same value as either B or C");
		}

		_a = p;

		if (checkColinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point getB() {
		return _b;
	}

	public void setB(Point p) {
		if (p.equals(_a) || p.equals(_c)) {
			throw new RuntimeException("Attempting to set point B to same value as either A or C");
		}

		_b = p;

		if (checkColinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point getC() {
		return _c;
	}

	public void setC(Point p) {
		if (p.equals(_a) || p.equals(_b)) {
			throw new RuntimeException("Attempting to set point C to same value as either A or B");
		}

		_c = p;

		if (checkColinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point[] getPoints() {
        return new Point[]{_a, _b, _c};
	}

	public void setPoints(Point[] points) {
		if (points[0].equals(points[1]) ||
				points[0].equals(points[2]) ||
				points[1].equals(points[2])) {
			throw new RuntimeException("At least two points have same value");
		}

		_a = points[0];
		_b = points[1];
		_c = points[2];

		if (checkColinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public double getPerimeter() {
		return sideABLength() + sideBCLength() + sideCALength();
	}

	public double getArea() {
		double s = getPerimeter() / 2.0;
		return Math.sqrt(s * (s-sideABLength()) * (s-sideBCLength()) * (s-sideCALength()));
	}

	// These methods are private because they are not
	// part of an interface implemented by the class
	// but are instead internal methods used as 
	// part of that implementation.
	
	private boolean checkColinearity() {
		return (getArea() < AREA_EPSILON);
	}

	private double sideABLength() {
		return _a.distanceTo(_b);
	}

	private double sideBCLength() {
		return _b.distanceTo(_c);
	}

	private double sideCALength() {
		return _c.distanceTo(_a);
	}
}
