package coffeeShop;

public class DarkChocolateMocha extends Coffee{

	
	public DarkChocolateMocha(String coffeeType, double price, Order order) {
		super(coffeeType, price, order);
	}
	
	
	@Override
	public void prepareDrink() {
		System.out.println("Coffee Type: " + super.getCoffeeType());
		
	}

	@Override
	public void ingredients() {
		System.out.println("Ingredients: Hot milk, gound coffe, cocoa powder, sugar, vanilla extract, whipped cream");
		
	}


	@Override
	public String toString() {
		return "DarkChocolateMocha []";
	}
	
	

}
