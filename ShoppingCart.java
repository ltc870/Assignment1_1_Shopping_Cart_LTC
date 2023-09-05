
/**
 * An interface that describes the operations of a Shopping Cart of objects
 * 
 * @author Lawrence Caudle
 */
public class ShoppingCart {

	private ResizableArrayBag<Item> cart;

	public ShoppingCart() {

		cart = new ResizableArrayBag<>();
	}

	/**
	 * Gets the current number of entries in this Shopping Cart
	 * 
	 * @return The integer number of entries currently in the bag.
	 */
	public int getCurrentSize() {
		return cart.getCurrentSize();
	}

	/**
	 * Sees whether this Shopping Cart is empty.
	 * 
	 * @return True if the bag is empty, and False if the bag is not empty.
	 */
	public boolean isEmpty() {
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
	public boolean addItem(Item item) {
		return cart.add(item);
	};

	/**
	 * Removes one unspecified entry from this Shopping Cart and sets the new total
	 * price of the Shopping Cart.
	 * 
	 * @return Either the removed entry, if the removal was successful, or null.
	 */
	public Item remove() {
		Item removedItem = cart.remove();
		if (removedItem != null) {

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
	public boolean remove(Item anEntry) {
		boolean removed = cart.remove(anEntry);
		if (removed) {
		}
		return removed;
	}

	/**
	 * Removes all of the entry from the Shopping Cart and reduces the Shopping Cart
	 * price to zero.
	 */
	public void clear() {
		cart.clear();
	}

	/**
	 * Counts the number of items a given entry appears in this Shopping Cart.
	 * 
	 * @param anEntry The entry to be counted.
	 * @return The number of times anEntry appears in the Shopping Cart.
	 */
	public int getFrequencyOf(Item anEntry) {
		return cart.getFrequencyOf(anEntry);
	}

	/**
	 * Tests whether this Shopping Cart contains a given entry.
	 * 
	 * @param anEntry The entry to find.
	 * @return True if the Shopping Cart contains anEntry, or false if not.
	 */
	public boolean contains(Item anEntry) {
		return cart.contains(anEntry);
	}

	/**
	 * Retrieves all entries that are in the Shopping Cart
	 * 
	 * @return A newly allocated array of all the entries in the Shopping Cart.
	 */
	public String[] displayCart() {
		Object[] itemArray = cart.toArray();
		String[] itemNames = new String[itemArray.length];

		for (int i = 0; i < itemArray.length; i++) {
			Item item = (Item) itemArray[i];
			itemNames[i] = item.getName();
		}

		return itemNames;
	}

	/**
	 * Retrieves the total price all of the items in the Shopping Cart costs.
	 * 
	 * @return
	 */
	public double getTotalCartPrice() {
		double totalPrice = 0.0;
		Object[] itemArray = cart.toArray();
		for (Object item : itemArray) {
			totalPrice += ((Item) item).getPrice();
		}
		return totalPrice;
	}
}
