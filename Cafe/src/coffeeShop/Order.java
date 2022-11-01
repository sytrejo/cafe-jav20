package coffeeShop;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
	
	List<Order> orders = new ArrayList<>();
	
	int id;
	String type;
	OrderStatus status;
	
	public Order(int id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public Order(String type) {
		if(type.equals("DriveThru")){
			DriveThru order = new DriveThru(id, type);
			orders.add(order);
		}else if(type.equals("Delivery")) {
			Delivery order = new Delivery(id, type);
			orders.add(order);
		}

	}
	
	public Order(int id, String type, OrderStatus status) {
		this.id = id;
		this.status = status;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", type=" + type + ", status=" + status + "]";
	}
	
	public void removeOrder(Order order) {
		orders.remove(order);
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	


}
