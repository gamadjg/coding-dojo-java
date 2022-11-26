public class JavaCafe {
	public static void main(String[] args) {
		// APP VARIABLES
		// Lines of text that will appear in the app.
		String generalGreeting = "Welcome to Cafe Java, ";
		String pendingMessage = ", your order will be ready shortly";
		String readyMessage = ", your order is ready";
		String displayTotalMessage = "Your total is $";

		// Menu variables (add yours below)
		double mochaPrice = 3.5;
		double dropCoffee = 4.0;
		double latte = 5.0;
		double cappuccino = 5.0;

		// Customer name variables (add yours below)
		String customer1 = "Cindhuri";
		String customer2 = "Sam";
		String customer3 = "Jimmy";
		String customer4 = "Noah";


		// Order completions (add yours below)
		boolean isReadyOrder1 = true;
		boolean isReadyOrder2 = true;
		boolean isReadyOrder3 = true;
		boolean isReadyOrder4 = true;

		// APP INTERACTION SIMULATION (Add your code for the challenges below)

		System.out.println("Print test #1");

		System.out.println(generalGreeting + customer1);
		System.out.println(customer1+readyMessage);

		if(isReadyOrder4){
			System.out.println(customer4+readyMessage+". "+displayTotalMessage+cappuccino);
			// System.out.println(displayTotalMessage+cappuccino);
		} else{
			System.out.println(customer4+pendingMessage);
		}

		if(isReadyOrder2){
			System.out.println(customer2+readyMessage+". "+displayTotalMessage+latte*2);
			// System.out.println(displayTotalMessage+cappuccino);
		} else{
			System.out.println(customer2+pendingMessage);
		}

		System.out.println(customer3+readyMessage+". "+displayTotalMessage+(latte-dropCoffee));

		isReadyOrder1 = false;
		isReadyOrder2 = false;
		isReadyOrder3 = false;
		isReadyOrder4 = false;

		mochaPrice = 35.0;
		dropCoffee = 40.0;
		latte = 75.0;
		cappuccino = 95.0;

		System.out.println("Print test #2");


		System.out.println(generalGreeting + customer1);
		System.out.println(customer1+readyMessage);

		if(isReadyOrder4){
			System.out.println(customer4+readyMessage+". "+displayTotalMessage+cappuccino);
			// System.out.println(displayTotalMessage+cappuccino);
		} else{
			System.out.println(customer4+pendingMessage);
		}

		if(isReadyOrder2){
			System.out.println(customer2+readyMessage+". "+displayTotalMessage+latte*2);
			// System.out.println(displayTotalMessage+cappuccino);
		} else{
			System.out.println(customer2+pendingMessage);
		}

		System.out.println(customer3+readyMessage+". "+displayTotalMessage+(latte-dropCoffee));


		// ** Your customer interaction print statements will go here ** //

	}
}
