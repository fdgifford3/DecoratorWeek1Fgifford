// Price is for about 1/5th of cake to have Buttercream Flowers
public class ButtercreamFlowers extends CakeDecorator {

	// Set instance variable for getting description and size
				public ButtercreamFlowers(Cake cake) {
					this.cake = cake;
				}
				
				public String getDescription() {
					return cake.getDescription() + ", Buttercream Flowers";
				}

				public double cost() {
					double cost = cake.cost();
					Size size = cake.getSize();
					
					if (size == Size.FOUR) {
						cost += 1.50;
					} else if (size == Size.SIX) {
						cost += 3.00;
					} else if (size == Size.EIGHT) {
						cost += 4.50;
					} else if (size == Size.TEN) {
						cost += 6.00;
					}
					return cost;
				}

			}
