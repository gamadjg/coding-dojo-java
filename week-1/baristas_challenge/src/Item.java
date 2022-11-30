public class Item {
//	ATTRIBUTES
	private String name;
	private double price = 0;

//	CONSTRUCTORS
	public Item(){
		this.name = "No item";
	}

	public Item(String name, double price){
		this.name = name;
		this.price = price;
	}

//	--------------------------------- SET/GET ---------------------------------
//	 NAME
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
//	PRICE
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}
}
