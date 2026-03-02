/**
 * Extends abstract class shape.
 * 
 * Calculate and returns the area of a rectangle.
 * 
 * @author KHolden
 */

public class Rectangle extends Shape {
	
	/**
	 * Width of rectangle
	 */
	private int width;
	
	/**
	 * Height of rectangle
	 */
	private int height;
	
	/**
	 * Total area of the rectangle
	 */
	private int area;
	
	/**
	 * Gets the width of the rectangle
	 * @return width of the rectangle
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Gets the height of the rectangle
	 * @return height of the rectangle
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Sets the width of the rectangle
	 * @param width of rectangle
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Sets the height of the rectangle
	 * @param height of the rectangle
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Calculate the area of the rectangle
	 * @return Area of the rectangle
	 */
	public int getArea() {
		area = width*height;
		
		return area;
	}
	
	/**
	 * Constructor
	 */
	public Rectangle() {
		super(4);
	}
}
