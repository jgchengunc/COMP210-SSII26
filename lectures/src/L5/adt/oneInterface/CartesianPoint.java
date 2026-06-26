package L5.adt.oneInterface;

public class CartesianPoint implements Point {

	private double _x;
	private double _y;
	
	private final static double POINT_EPSILON = 0.0001;

	public CartesianPoint(double x, double y) {
		this._x = x;
		this._y = y;
	}

	public double distanceTo(Point otherPoint) {
		return Math.sqrt(Math.pow(getX() - otherPoint.getX(), 2) + Math.pow(getY() - otherPoint.getY(), 2));
	}
	
	public double getX() {
		return _x;
	}
		
	public double getY() {
		return _y;
	}
	
	public boolean equals(Point otherPoint) {
		boolean xCloseEnough = (Math.abs(getX() - otherPoint.getX()) < POINT_EPSILON);
		boolean yCloseEnough = (Math.abs(getY() - otherPoint.getY()) < POINT_EPSILON);
		
		return (xCloseEnough && yCloseEnough);
	}
}