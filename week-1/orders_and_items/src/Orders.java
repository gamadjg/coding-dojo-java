import java.util.ArrayList;

public class Orders {
	// Attributes
	public String name;
	public double total;
	public boolean ready;
	public ArrayList<Item> items = new ArrayList<Item>();

	// Empty constructor
	public Orders(){
		this.name = "No orders";
		this.total = 0;
		this.ready = false;
		this.items = new ArrayList<Item>();
	}
	// Constructor with attributes
	public Orders(String name){ //, double total, boolean ready){
		this.name = name;
//		this.items = items;
	}
	// -------------------------------Name-------------------------------
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	// -------------------------------Total-------------------------------
	public void setTotal(double total){
		this.total = total;
	}
	public double getTotal(){
		double sum=0;
		for(Item item:this.items){
			sum+=item.getPrice();
		}
		this.total = sum;
		return this.total;
	}
	// -------------------------------Ready-------------------------------
	public void setReady(boolean ready){
		this.ready = ready;
	}
	public boolean getReady(){
		return this.ready;
	}
	// -------------------------------Items-------------------------------
	public void setItem(Item item){
		this.total += item.getPrice();
		this.items.add(item);
	}

	public void setItems(ArrayList<Item> items){
		double sum = 0.0;
		for(Item item: this.items){
			sum += item.getPrice();
		}
		this.total = sum;
		this.items = items;
	}
	public void printItems(){
		for(Item item: this.items){
			System.out.println(item.getName());
		}
	}
}
