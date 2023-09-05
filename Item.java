public class Item {

	// field data members
	private String name;
	private double price;

	// empty argument constructor
	public Item() {
		name = "";
		price = 0.0;
	}

	// preferred constructor
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * Get the name of the Item
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the Item
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the price of the item
	 * 
	 * @return double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Set the price of the item
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
