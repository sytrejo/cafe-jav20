package coffeeShop;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		OrderStatus preparing = OrderStatus.PREPARING;
		OrderStatus finished = OrderStatus.FINISH;
		OrderStatus collected = OrderStatus.COLLECTED;
		
		
		Order order1 = new DriveThru(1, "DriveThru");
		Order order2 = new DriveThru(2, "DriveThru");
		Order order3 = new DriveThru(3, "DriveThru");
		Order order4 = new DriveThru(4, "DriveThru");
		Order order5 = new DriveThru(5, "DriveThru");
		
		Order order6 = new Delivery(6, "Delivery");
		Order order7 = new Delivery(7, "Delivery");
		Order order8 = new Delivery(8, "Delivery");
		Order order9 = new Delivery(9, "Delivery");
		Order order10 = new Delivery(10, "Delivery");
		
		DarkChocolateMocha drink1 = new DarkChocolateMocha("DarkChocolateMocha", 5.00, order1);
		CoffeeMocha drink2 = new CoffeeMocha("CoffeeMocha", 6.00, order2);
		DarkChocolateMocha drink3 = new DarkChocolateMocha("DarkChocolateMocha", 5.00, order3);
		CoffeeMocha drink4 = new CoffeeMocha("CoffeeMocha", 6.00, order4);
		DarkChocolateMocha drink5 = new DarkChocolateMocha("DarkChocolateMocha", 5.00, order5);
		
		
		CoffeeMocha drink6 = new CoffeeMocha("CoffeeMocha", 6.00, order6);
		DarkChocolateMocha drink7 = new DarkChocolateMocha("DarkChocolateMocha", 5.00, order7);
		CoffeeMocha drink8 = new CoffeeMocha("CoffeeMocha", 6.00, order8);
		DarkChocolateMocha drink9 = new DarkChocolateMocha("DarkChocolateMocha", 5.00, order9);
		CoffeeMocha drink10 = new CoffeeMocha("CoffeeMocha", 6.00, order10);
	
		
		order1.setStatus(preparing);
		order6.setStatus(preparing);
		System.out.println(drink1.getOrder());
		
		List<Order> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order6);
		
		for(Order order : orders) {
			System.out.println(order);
		}
		
		List<Order> driveThruOrders = new ArrayList<>();
		List<Order> deliveryOrders = new ArrayList<>();
		
		for(int i = 0; i < orders.size() ; i++) {
			Order a = orders.get(i);
			if(a instanceof DriveThru) {
				Order aOrder = (DriveThru) a;
				driveThruOrders.add(aOrder);
			} else if(a instanceof Delivery) {
				Order aOrder = (Delivery) a;
				deliveryOrders.add(aOrder);
			}
		}
		
		for(Order order : driveThruOrders) {
			System.out.println(order);
		}
		
		for(Order order : deliveryOrders) {
			System.out.println(order);
		}
		
	
		
		
		
		

	}

}
