
public class Driver {
	
	public static void main(String[] args) {
		
		
		Rectangle rect = new Rectangle();
		Circle circ = new Circle();
		Ellipse elip = new Ellipse();
		
		rect.setHeight(2);
		rect.setWidth(1);
		
		circ.setRadius(2);
		
		elip.setHeight(10);
		elip.setWidth(5);
		
		System.out.println(rect.getArea());
		System.out.println(circ.getArea());
		System.out.println(elip.getArea());
		
	}
}