
/**
 * @author yajurvashisht
 * Class Square uses Shape2D to determine the circumference and area of a square.
 *
 */
public class Square extends Shape2D {

	public Square() { //setting value of "l" (aka length)
		this(1.0);
	}

	public Square(double l) {
		super(l, l);
	}

	@Override
	public void setHeight(double l) { 
		super.setHeight(l);
		super.setWidth(l);
	}
	
	@Override
	public void setWidth(double l) {
		super.setHeight(l);
		super.setWidth(l);
	}
	
	@Override
	public double getCircumference() { //calculating circumference of a square, also includes a check to ensure h and w are equal
		if (getWidth() == getHeight()) {
			return 2 * this.getWidth() + 2 * this.getHeight();	
		} else {
			System.out.println("The width and height for a square must be equal.");
		}
		return 0.0;
	}

	@Override
	public double getArea() { //calculates area
		return this.getWidth() * this.getHeight();
	}

}
