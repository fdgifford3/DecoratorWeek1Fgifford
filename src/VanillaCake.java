
public class VanillaCake extends Cake {

	public VanillaCake(Size size) {
		this.size = size;
		this.description = "Vanilla Cake";
	}
	

	public double cost() {
		double cost = 0.00;
		
		if (this.size == Size.FOUR) {
			cost = 18.00;
		} else if (this.size == Size.SIX) {
			cost = 28.00;
		} else if (this.size == Size.EIGHT) {
			cost = 40.00;
		} else if (this.size == Size.TEN) {
			cost = 58.00;
		}
		return cost;
	}

}
