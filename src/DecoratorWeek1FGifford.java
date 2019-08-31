
public class DecoratorWeek1FGifford {

	public static void main(String[] args) {
		// Test some Cake Types, sizes, and decorators to see how it works
		Cake cake = new VanillaCake(Cake.Size.FOUR);
		System.out.println(cake.getDescription() + " $" + cake.cost());
		
		cake = new ButtercreamFrosting(cake);
		System.out.println(cake.getDescription() + " $" + cake.cost());
	}

}
