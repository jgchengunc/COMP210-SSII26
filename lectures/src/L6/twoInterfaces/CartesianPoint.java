package L6.twoInterfaces;

public class CartesianPoint implements Point {
	private double _x;
	private double _y;

	private final static double POINT_EPSILON = 0.0001;

	public CartesianPoint(double x, double y) {
		this._x = x;
		this._y = y;
	}

	public double distanceTo(Point other) {
		return Math.sqrt(Math.pow(getX() - other.getX(), 2) + Math.pow(getY() - other.getY(), 2));
	}

	public double getX() {
		return _x;
	}

	public double getY() {
		return _y;
	}

	public boolean equals(Point other) {
		boolean xCloseEnough = (Math.abs(getX() - other.getX()) < POINT_EPSILON);
		boolean yCloseEnough = (Math.abs(getY() - other.getY()) < POINT_EPSILON);

		return (xCloseEnough && yCloseEnough);
	}
}