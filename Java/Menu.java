
public class Menu {
	void displayMenuOption(int opt) throws InvalidOptionException {
		String msg;
		switch(opt) {
			case 1:
				msg = "Option one selected";
				break;
			case 2:
				msg = "Option two selected";
				break;
			case 3:
				msg = "Option three selected";
				break;
			default:
				throw new InvalidOptionException("Option should be between 1 and 3");
		}
		
		System.out.println(msg);
		
	}
}
