
/**
 * @author yajurvashisht
 * Class RightTriangle uses Shape2D to determine the circumference and area of a right triangle.
 *
 */
public class RightTriangle extends Shape2D {
	
	public RightTriangle() { //setting width and height
		this(1.0,  2.0);
	}

	public RightTriangle(double w, double h) {
		super(w, h);
	}

	@Override
	public double getCircumference() { //calculating circumference
        double hypotenuse = Math.sqrt((getWidth() * getWidth()) + (getHeight() * getHeight()));
        return getWidth() + getHeight() + hypotenuse;
	}

	@Override
	public double getArea() { //calculating area
		return 0.5 * this.getHeight() * this.getWidth();
	}
}