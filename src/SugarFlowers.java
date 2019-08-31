
public class SugarFlowers extends CakeDecorator {


	// Set instance variable for getting description and size
	public SugarFlowers(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Sugar Flowers";
	}

	public double cost() {
		double cost = cake.cost();
		Size size = cake.getSize();
		
		if (size == Size.FOUR) {
			cost += 3.00;
		} else if (size == Size.SIX) {
			cost += 3.50;
		} else if (size == Size.EIGHT) {
			cost += 4.00;
		} else if (size == Size.TEN) {
			cost += 4.50;
		}
		return cost;
	}

}
