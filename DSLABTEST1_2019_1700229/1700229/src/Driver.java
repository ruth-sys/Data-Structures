/*Name : Ruth Elliott
 *Id : 1700229
 */

public class Driver {

	public static void main(String[] args) {
		Linkedlist List = new Linkedlist();
		List.CreateList();
		List.InsertAtFront(new Canteen(001, "Chicken Sandwich", 98.00f));
		List.InsertAtFront(new Canteen(732, "Patties", 58.00f));
		List.InsertAtFront(new Canteen(145, "Chicken Combo", 118.00f));
		List.InsertAtFront(new Canteen(264, "Pastries", 38.00f));
		List.InsertAtFront(new Canteen(562, "Drinks", 48.00f));
		System.out.println("Sum of all Products: "+List.SumOfPrices());
		List.DisplayList();

	}

}
