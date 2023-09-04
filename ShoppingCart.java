
public class ShoppingCart {
	
	private ResizableArrayBag<Item> cart;
	  private double totalPrice;

	  public ShoppingCart() {

	    cart = new ResizableArrayBag<>();
	    totalPrice = 0.0;
	  }

	  /**
	   * Gets the current number of entries in this Shopping Cart
	   * 
	   * @return The integer number of entries currently in the bag.
	   */
	  int getCurrentSize() {
	    return cart.getCurrentSize();
	  }

	  /**
	   * Sees whether this Shopping Cart is empty.
	   * 
	   * @return True if the bag is empty, and False if the bag is not empty.
	   */
	  boolean isEmpty() {
	    return cart.isEmpty();
	  }

	  /**
	   * Adds a new entry to this Shopping Cart and sets the new total price of the
	   * Shopping Cart.
	   * 
	   * @param newEntry The object to be added as a new entry.
	   * @return True if the addition was successful, or false if the addition was not
	   *         successful.
	   */
	  void addItem(Item item) {
	    cart.add(item);
	    totalPrice += item.getPrice();
	    setTotalCartPrice(totalPrice);
	  };

	  /**
	   * Removes one unspecified entry from this Shopping Cart and sets the new total
	   * price of the Shopping Cart.
	   * 
	   * @return Either the removed entry, if the removal was successful, or null.
	   */
	  Item remove() {
	    Item removedItem = cart.remove();
	    if (removedItem != null) {
	      totalPrice -= removedItem.getPrice();
	      setTotalCartPrice(totalPrice);
	    }
	    return removedItem;
	  }

	  /**
	   * Removes a specified entry from this Shopping Cart and sets the new total
	   * price of the Shopping Cart.
	   * 
	   * @param anEntry The entry to be removed.
	   * @return True if the removal was successful, or false if the removal was not
	   *         successful.
	   */
	  boolean remove(Item anEntry) {
	    boolean removed = cart.remove(anEntry);
	    if (removed) {
	      totalPrice -= anEntry.getPrice();
	      setTotalCartPrice(totalPrice);
	    }
	    return removed;
	  }

	  /**
	   * Removes all of the entry from the Shopping Cart and reduces the Shopping Cart
	   * price to zero.
	   */
	  void clear() {
	    cart.clear();
	    setTotalCartPrice(0.0);
	  }

	  /**
	   * Counts the number of items a given entry appears in this Shopping Cart.
	   * 
	   * @param anEntry The entry to be counted.
	   * @return The number of times anEntry appears in the Shopping Cart.
	   */
	  int getFrequencyOf(Item anEntry) {
	    return cart.getFrequencyOf(null);
	  }

	  /**
	   * Tests whether this Shopping Cart contains a given entry.
	   * 
	   * @param anEntry The entry to find.
	   * @return True if the Shopping Cart contains anEntry, or false if not.
	   */
	  boolean contains(Item anEntry) {
	    return cart.contains(anEntry);
	  }

	  /**
	   * Retrieves all entries that are in ths Shopping Cart
	   * 
	   * @return A newly allocated array of all the entries in the Shopping Cart.
	   */
	  Item[] displayCart() {
	    return cart.toArray();
	  }

	  /**
	   * Retrieves the total price all of the items in the Shopping Cart costs.
	   * 
	   * @return
	   */
	  double getTotalCartPrice() {
	    return totalPrice;
	  }

	  private void setTotalCartPrice(double totalPrice) {
	    this.totalPrice = totalPrice;
	  }
}
