/**
 * Extends abstract class shape.
 * 
 * Calculates and returns area of a circle.
 * 
 * @author KHolden
 */
public class Circle extends Shape{

	/**
	 * Radius of circle
	 */
	private int radius;
	
	/**
	 * gets radius of circle
	 * @return radius of circle
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Sets radius of circle
	 * @param radius of circle
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	/**
	 * Calculates area of circle
	 */
	public int getArea() {
		return (int) Math.pow(Math.PI*radius, 2);
	}
	
	/**
	 * Constructor
	 */
	public Circle() {
		super(1);
	}
}
