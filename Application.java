
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShoppingCart shoppingCart = new ShoppingCart();

		    Item toySoldier = new Item("G.I. Joe Toy", 3.45, "Toy soldier");
		    shoppingCart.addItem(toySoldier);
		    Item tire = new Item("Tire", 110.45, "New Sedan Tire");
		    shoppingCart.addItem(tire);

		    System.out.println(shoppingCart.displayCart());
	}

}
