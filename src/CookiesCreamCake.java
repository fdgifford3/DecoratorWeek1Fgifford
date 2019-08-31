

public class CookiesCreamCake extends Cake {
	public CookiesCreamCake(Size size) {
		this.size = size;
		this.description = "Cookies and Cream Cake";
	}
	

	public double cost() {
		double cost = 0.00;
		
		if (this.size == Size.FOUR) {
			cost = 19.00;
		} else if (this.size == Size.SIX) {
			cost = 30.00;
		} else if (this.size == Size.EIGHT) {
			cost = 42.00;
		} else if (this.size == Size.TEN) {
			cost = 61.00;
		}
		return cost;
	}

}
