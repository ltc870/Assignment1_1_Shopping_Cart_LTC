import java.util.Arrays;
import java.text.DecimalFormat;

public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {

    ShoppingCart cart = new ShoppingCart();
    DecimalFormat dFormat = new DecimalFormat("0.00");

    Item toySoldier = new Item("G.I. Joe Toy", 3.45);
    System.out.println("Was an item added?: " + cart.addItem(toySoldier));
    Item tire = new Item("Tire", 110.45);
    System.out.println("Was an item added?: " + cart.addItem(tire));
    System.out.println("Was an item added?: " + cart.addItem(tire));
    Item jumpRope = new Item("Jump Rope", 5.00);
    System.out.println("Was an item added?: " + cart.addItem(jumpRope));
    Item hondaHRV = new Item("Honda HR-V", 27000.55);
    System.out.println("Was an item added?: " + cart.addItem(hondaHRV));
    Item flatScreenTV = new Item("Flat Screen TV", 650.50);
    System.out.println("Was an item added?: " + cart.addItem(flatScreenTV));
    Item orangeJuice = new Item("Orange Juice", 5.99);
    System.out.println("Was an item added?: " + cart.addItem(orangeJuice));
    Item basketball = new Item("Basketball", 6.99);
    System.out.println("Was an item added?: " + cart.addItem(basketball));
    System.out.println("Was an item added?: " + cart.addItem(basketball));
    System.out.println("How many items are in the cart?: " + cart.getCurrentSize());

    System.out.println("Get the total price of cart: " + dFormat.format(cart.getTotalCartPrice()));
    System.out.println("Display the items in the cart: " + Arrays.toString(cart.displayCart()));
    System.out.println("Get the frequency of an item: " + cart.getFrequencyOf(tire));
    System.out.println("Does this cart contain jump ropes?: " + cart.contains(jumpRope));
    System.out.println("Is the cart empty?: " + cart.isEmpty());
    System.out.println("What's the price of an item ?: " + orangeJuice.getPrice());
    System.out.println(("Remove item from the cart: " + cart.remove().getName()));
    System.out.println(("Remove item from the cart: " + cart.remove().getName()));
    System.out.println(("Remove item from the cart: " + cart.remove().getName()));
    System.out.println("Remove a particular item: " + cart.remove(flatScreenTV));
    System.out.println("What's currently in the cart?: " + Arrays.toString(cart.displayCart()));
    cart.clear();
    System.out.println("What's currently in the cart?: " + Arrays.toString(cart.displayCart()));
  }
}
