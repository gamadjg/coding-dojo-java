import java.util.ArrayList;

public class TestOrders {
	public static void main(String[] args) {

		// Menu items
		Item item1 = new Item("mocha", 3.50);
		Item item2 = new Item("latte", 7.00);
		Item item3 = new Item("drop coffee", 10.0);
		Item item4 = new Item("capuccino", .50);

		// Order variables -- order1, order2 etc.
		Orders order1 = new Orders("Cindhuri");
		Orders order2 = new Orders("Jimmy");
		Orders order3 = new Orders("Noah");
		Orders order4 = new Orders("Sam");

		//
		order2.setItem(item1);
		order3.setItem(item4);
		order4.setItem(item2);
		order1.setReady(true);
		order4.setItem(item2);
		order4.setItem(item2);
		order2.setReady(true);
		// Application Simulations
		// Use this example code to test various orders' updates

		// Order 1
		// System.out.printf("Name: %s\n", order1.name);
		// System.out.printf("Total: %s\n", order1.total);
		// System.out.printf("Ready: %s\n", order1.ready);

		// Order 2
		// System.out.printf("Name: %s\n", order2.name);
		// System.out.printf("Total: %s\n", order2.total);
		// System.out.printf("Ready: %s\n", order2.ready);

		// Order 3
		// System.out.printf("Name: %s\n", order3.name);
		// System.out.printf("Total: %s\n", order3.total);
		// System.out.printf("Ready: %s\n", order3.ready);

		// Order 4
		// System.out.printf("Name: %s\n", order4.name);
		// System.out.printf("Total: %s\n", order4.total);
		// System.out.printf("Ready: %s\n", order4.ready);
	}
}