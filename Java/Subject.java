
abstract class Subject implements Delivery{
	private String name;
	private String description;
	
	public abstract int getCredit();
	
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	
	public Subject(String name, String description) {
		name = this.name;
		description = this.description;
	}
	
}
