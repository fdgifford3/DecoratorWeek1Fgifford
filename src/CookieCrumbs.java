
public class CookieCrumbs extends CakeDecorator {

	// Set instance variable for getting description and size
			public CookieCrumbs(Cake cake) {
				this.cake = cake;
			}
			
			public String getDescription() {
				return cake.getDescription() + ", Cookie Crumbs";
			}

			public double cost() {
				double cost = cake.cost();
				Size size = cake.getSize();
				
				if (size == Size.FOUR) {
					cost += 0.50;
				} else if (size == Size.SIX) {
					cost += 1.00;
				} else if (size == Size.EIGHT) {
					cost += 1.50;
				} else if (size == Size.TEN) {
					cost += 2.00;
				}
				return cost;
			}

		}
