
public class ConfettiCake extends Cake {
	public ConfettiCake(Size size) {
		this.size = size;
		this.description = "Confetti Cake";
	}
	

	public double cost() {
		double cost = 0.00;
		
		if (this.size == Size.FOUR) {
			cost = 18.50;
		} else if (this.size == Size.SIX) {
			cost = 29.00;
		} else if (this.size == Size.EIGHT) {
			cost = 41.00;
		} else if (this.size == Size.TEN) {
			cost = 60.00;
		}
		return cost;
	}

}
