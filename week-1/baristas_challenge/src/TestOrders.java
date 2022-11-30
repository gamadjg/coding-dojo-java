public class TestOrders {
	public static void main(String[] args) {

//		Menu items
		Item item1 = new Item("mocha", 3.50);
		Item item2 = new Item("latte", 7.00);
		Item item3 = new Item("drop coffee", 10.0);
		Item item4 = new Item("cappuccino", .50);

//		Order variables -- order1, order2 etc.
		Orders guestOrder = new Orders();
		Orders order1 = new Orders("Cindhuri");
		Orders order2 = new Orders("Jimmy");
		Orders order3 = new Orders("Noah");
		Orders order4 = new Orders("Sam");

//		Test run
		guestOrder.addItem(item1);
		guestOrder.addItem(item2);
		guestOrder.setReady(true);
		System.out.println(guestOrder.getStatusMessage());
		System.out.println(guestOrder.getOrderTotal());
		order2.addItem(item1);
		order3.addItem(item1);
		order4.addItem(item2);
		order1.setReady(true);
		order4.addItem(item2);
		order4.addItem(item2);
		order2.setReady(true);

//		 Application Simulations
//		 Use this example code to test various orders' updates

//		 Order 1
//		 System.out.printf("Name: %s\n", order1.name);
//		 System.out.printf("Total: %s\n", order1.total);
//		 System.out.printf("Ready: %s\n", order1.ready);
//
//		 Order 2
//		 System.out.printf("Name: %s\n", order2.name);
//		 System.out.printf("Total: %s\n", order2.total);
//		 System.out.printf("Ready: %s\n", order2.ready);
//
//		 Order 3
//		 System.out.printf("Name: %s\n", order3.name);
//		 System.out.printf("Total: %s\n", order3.total);
//		 System.out.printf("Ready: %s\n", order3.ready);
//
//		 Order 4
//		 System.out.printf("Name: %s\n", order4.getName());
//		 System.out.printf("Total: %s\n", order4.getOrderTotal());
//		 System.out.printf("Ready: %s\n", order4.getStatusMessage());
//		 order4.display();
		guestOrder.display();
		order1.display();
		order2.display();
		order3.display();
		order4.display();
	}
}