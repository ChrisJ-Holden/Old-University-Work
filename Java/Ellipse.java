/*
 * Extends abstract method Shape.
 * 
 * Calculates and returns the area of an ellipse.
 */
public class Ellipse extends Rectangle{
	private float aaxis;
	private float baxis;
	
	public Ellipse() {
		this.aaxis = super.getHeight()/2;
		this.baxis = super.getWidth()/2;
		this.setSides(1);
	}
	/*
	 * Gets the area of an ellipse.
	 */
	public int getArea() {
		return (int)(Math.PI * aaxis * baxis); 
	}
}
