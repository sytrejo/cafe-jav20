package coffeeShop;

public abstract class Coffee implements IDrink{

	String coffeeType;
	double price;
	Order order;
	

	public Coffee(String coffeeType, double price, Order order) {
		this.coffeeType = coffeeType;
		this.price = price;
		this.order = order;
	}
	
	public String getCoffeeType() {
		return coffeeType;
	}
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public abstract void ingredients();

	@Override
	public String toString() {
		return "Coffee [coffeeType=" + coffeeType + ", price=" + price + ", order=" + order + "]";
	}
	
	
	

}
