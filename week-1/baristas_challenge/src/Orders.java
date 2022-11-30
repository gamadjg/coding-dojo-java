import java.util.ArrayList;

public class Orders {
	//------------------------------- ATTRIBUTES -------------------------------
	private String name;
	private double total = 0;
	private boolean ready = false;
	private ArrayList<Item> items = new ArrayList<>();

	// ------------------------------- CONSTRUCTORS -------------------------------
	public Orders(){
		this.name = "Guest";
	}

	public Orders(String name){
		this.name = name;
	}

	public Orders(String name, ArrayList<Item> items){
		this.name = name;
		this.items = items;
	}

	// ------------------------------- GENERAL METHODS -------------------------------
	public void addItem(Item item){
		this.items.add(item);
	}
	public void display(){
		System.out.printf("Customer: %s\n", this.name);
		for(Item item: this.items){
			System.out.printf("%s - $%f\n", item.getName(), item.getPrice());
		}
		System.out.printf("Total: $%f\n", this.getOrderTotal());
	}
	public double getOrderTotal(){
		double sum = 0;
		for(Item item:this.items){
			sum+=item.getPrice();
		}
		this.total = sum;
		return this.total;
	}
	public String getStatusMessage(){
		if(this.ready){
			return "Your order is ready.";
		};
		return "Thank you for waiting. Your order will be ready soon.";
	}
	public void printItems(){
		for(Item item: this.items){
			System.out.println(item.getName());
		}
	}
//	--------------------------------- SET/GET ---------------------------------
//  NAME
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

//	TOTAL
	public void setTotal(double total){
		this.total = total;
	}
	public double getTotal(){
		return this.total;
	}

//  READY
	public void setReady(boolean ready){
		this.ready = ready;
	}
	public boolean getReady(){
		return this.ready;
	}

//  ITEMS
	public void setItems(ArrayList<Item> items){
		this.items = items;
	}
	public ArrayList<Item> getItems(){
		return this.items;
	}
}
