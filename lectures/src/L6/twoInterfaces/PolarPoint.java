package L6.twoInterfaces;

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

	public double distanceTo(Point other) {
		return Math.sqrt(Math.pow(getX() - other.getX(), 2) + Math.pow(getY() - other.getY(), 2));
	}

	public boolean equals(Point other) {
		boolean x_close_enough = (Math.abs(getX() - other.getX()) < POINT_EPSILON);
		boolean y_close_enough = (Math.abs(getY() - other.getY()) < POINT_EPSILON);
		
		return (x_close_enough && y_close_enough);
	}

}
