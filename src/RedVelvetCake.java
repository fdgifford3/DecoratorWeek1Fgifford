

public class RedVelvetCake extends Cake {
	
	public RedVelvetCake(Size size) {
		this.size = size;
		this.description = "Red Velvet Cake";
	}
	

	public double cost() {
		double cost = 0.00;
		
		if (this.size == Size.FOUR) {
			cost = 21.00;
		} else if (this.size == Size.SIX) {
			cost = 32.00;
		} else if (this.size == Size.EIGHT) {
			cost = 44.00;
		} else if (this.size == Size.TEN) {
			cost = 65.00;
		}
		return cost;
	}

}
