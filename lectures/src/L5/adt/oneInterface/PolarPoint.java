package L5.adt.oneInterface;

public class PolarPoint implements Point {

	private double _theta;
	private double _r;
	
	final private static double POINT_EPSILON = 0.0001;
	
	public PolarPoint(double theta, double r) {
		this._theta = theta;
		this._r = r;
	}
	
	public double getX() {
		return (_r * Math.cos(_theta));
	}

	public double getY() {
		return (_r * Math.sin(_theta));
	}

	public double distanceTo(Point otherPoint) {
		return Math.sqrt(Math.pow(getX() - otherPoint.getX(), 2) + Math.pow(getY() - otherPoint.getY(), 2));
	}

	public boolean equals(Point otherPoint) {
		boolean xCloseEnough = (Math.abs(getX() - otherPoint.getX()) < POINT_EPSILON);
		boolean yCloseEnough = (Math.abs(getY() - otherPoint.getY()) < POINT_EPSILON);

		return (xCloseEnough && yCloseEnough);
	}

}
