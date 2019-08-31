// Base abstract Cake class for our abstract decorator 
// And our concrete specific cake types to extend
public abstract class Cake {

	// Cake sizes are 4", 6", 8", and 10" only at our online bakery
	public enum Size { FOUR, SIX, EIGHT, TEN };
	
	Size size = Size.FOUR;
	String description = "Unknown Cake Type";
	
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();
}
