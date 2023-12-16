
/**
 * @author yajurvashisht
 * The class Rectangle uses Shape2D and IShapePoints to determine the circumference, area, and then print in the
 * TestShapes.java the required parameters.
 *
 */
public class Rectangle extends Shape2D implements IShapePoints {
	
	private Point2D referencePoint; //creating referencePoint
	
	public Rectangle() { //setting values of length and width
		this(1.0,  2.0);
	}

	public Rectangle(double w, double h) {
		super(w, h);
		this.referencePoint = new Point2D();
	}

	@Override
	public double getCircumference() { //calculating circumference
		return 2 * (this.getHeight() + this.getWidth());
	}

	@Override
	public double getArea() { //calculating area
		return this.getHeight() * this.getWidth();
	}

	@Override
	public Point2D getReferencePoint() { //getting reference point
		return new Point2D(referencePoint); 
	}
	
	@Override
	public void setReferencePoint(Point2D p) { //setting reference point
		this.referencePoint = new Point2D(p);
	}
	
	@Override
	//Creating a coordinate system to for all 4 points of a rectangle
	public Point2D[] getAllShapePoints() { 
		Point2D lowerRight = new Point2D (referencePoint.x + getWidth(), referencePoint.y);
		Point2D upperLeft = new Point2D(referencePoint.x, referencePoint.y + getHeight());
		Point2D upperRight = new Point2D(referencePoint.x + getWidth(), referencePoint.y + getHeight());
		Point2D [] points = {referencePoint, lowerRight, upperLeft, upperRight};
		return points;
	}
}
