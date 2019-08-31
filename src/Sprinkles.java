
public class Sprinkles extends CakeDecorator {

	// Set instance variable for getting description and size
		public Sprinkles(Cake cake) {
			this.cake = cake;
		}
		
		public String getDescription() {
			return cake.getDescription() + ", Sprinkles";
		}

		public double cost() {
			double cost = cake.cost();
			Size size = cake.getSize();
			
			if (size == Size.FOUR) {
				cost += 0.25;
			} else if (size == Size.SIX) {
				cost += 0.50;
			} else if (size == Size.EIGHT) {
				cost += 0.75;
			} else if (size == Size.TEN) {
				cost += 1.00;
			}
			return cost;
		}

	}
