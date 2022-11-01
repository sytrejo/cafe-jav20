package coffeeShop;

public class CoffeeMocha extends Coffee{

	public CoffeeMocha(String coffeeType, double price, Order order) {
		super(coffeeType, price, order);
	}

	@Override
	public void prepareDrink() {
		System.out.println("Coffee Type: " + coffeeType);
	}

	@Override
	public void ingredients() {
		System.out.println("Ingredients for this drink include : Hot milk, chocolate syrup, cocoa powder, and sugar");
		
	}

	@Override
	public String toString() {
		return "CoffeeMocha []";
	}

}
