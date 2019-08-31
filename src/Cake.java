

// Base abstract Cake class for our abstract decorator 
// And our concrete specific cake types to extend
public abstract class Cake {

	// Cake sizes are 4", 6", 8", and 10" only at our online bakery
	public enum Size { FOUR, SIX, EIGHT, TEN };
	
	Size size = Size.FOUR;
	String description = "Unknown Cake Type";
	
	// Add size to end of description in Cake abstract class 
	// So it cascades to all concrete cakes
	public String getDescription() {
		String desc = description;
		
		if (this.size == Size.FOUR) {
			desc += " Four Inch";
		} else if (this.size == Size.SIX) {
			desc += " Six Inch";
		} else if (this.size == Size.EIGHT) {
			desc += " Eight Inch";
		} else if (this.size == Size.TEN) {
			desc += " Ten Inch";
		}
		return desc;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();
}
