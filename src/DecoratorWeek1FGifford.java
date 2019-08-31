/*
 * Frederick Gifford
 * CPSC-60000 Week 1 Decorator Pattern with Baking Theme
 * 8.30.2019
 * Prof Nowak
 */
public class DecoratorWeek1FGifford {

	public static void main(String[] args) {
		System.out.println("Frederick Gifford\nCPSC-60000\nWeek 1 Decorator Pattern\n");
		// Test some Cake Types, sizes, and decorators to see how it works
		
		// Cakes are instantiated with a size. I decided NOT to allow
		// The Constructor to be overloaded with a no-argument method
		// Because we shouldn't allow a 'default' size to accidently be used
		Cake cake = new VanillaCake(Cake.Size.FOUR);
		System.out.println(cake.getDescription() + " $" + cake.cost());
		
		// Here is where the decorator pattern is used, wrap the cake in the decorator
		cake = new ButtercreamFrosting(cake);
		System.out.println(cake.getDescription() + " $" + cake.cost());
		
		// Can also wrap in one step
		Cake cake2 = new ButtercreamFrosting(new ChocolateCake(Cake.Size.SIX));
		System.out.println(cake2.getDescription() + " $" + cake2.cost());

		Cake cake3 = new CreamCheeseFrosting(new RedVelvetCake(Cake.Size.EIGHT));
		System.out.println(cake3.getDescription() + " $" + cake3.cost());
		
		// Wrapping lots of add-ons
		Cake cake4 = new Sprinkles(new SugarFlowers(new ButtercreamFlowers(new ButtercreamFlowers(
				new ButtercreamFrosting(new ConfettiCake(Cake.Size.TEN))))));
		System.out.println(cake4.getDescription() + " $" + cake4.cost());

	}

}
