public class Item {
	// Attributes
	private String name;
	private double price;

	// Empty constructor
	public Item(){
		this.name = "No item name.";
		this.price = 0;
	}
	//
	public Item(String name, double price){
		this.name = name;
		this.price = price;
	}

	// ------------------NAME------------------
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	// ------------------PRICE------------------
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}
}
