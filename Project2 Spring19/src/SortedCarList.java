/**
 * 
 * @author Jianhui Chen
 * @date 2 April, 2019
 * @Lab Section F
 */
public class SortedCarList extends CarList {

	public SortedCarList() {
		// System will automatically call the default constructor
	}

	/**
	 * 
	 * @param c: Car object
	 */
	public void add(Car c) {
		
		// Constructing a new node
		CarNode newCar = new CarNode(c);
		
		CarNode current = first.next;
		CarNode temp = first;
		
		while (current != null && current.data.getMake().compareToIgnoreCase(c.getMake()) < 0) {
			temp = current;
			current = current.next;
		}
		
		// Inserting the node to the proper position
		newCar.next = current;
		temp.next = newCar;
	}
}
