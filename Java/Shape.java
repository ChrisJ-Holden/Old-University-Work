/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 * 
 * Shows good use of Javadoc comments, annotations, visibility scope, modifiers and class hierarchies.
 * 
 * class marked as 'abstract' since it is not designed to be instantiated directly.
 *
 * EXAMPLE CLASS PROVIDED
 * @author mdixon
 */
abstract class Shape {
	
	/**
	 * Number of sides within the shape
	 */
	private int sides;
	
	/**
	 * Gets number of sides in shape
	 * @return sides of shape
	 */
	public int getSides() {
		return sides;
	}
	
	/**
	 * Sets number of sides in shape
	 * @param number of sides within shape
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	/**
	 * Gets area of shape
	 * @return area of shape
	 */
	abstract public int getArea();
	
	/**
	 * Constructor
	 * @param number of sides within shape
	 */
	Shape(int sides) {
		this.sides = sides;
	}
}
