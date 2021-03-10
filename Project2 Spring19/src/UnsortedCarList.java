/**
 * 
 * @author Jianhui Chen
 * @date 2 April, 2019
 * @Lab Section F
 */
public class UnsortedCarList extends CarList {

	public UnsortedCarList() {
		// System will automatically call the default constructor
	}
	
	/**
	 * 
	 * @param c: Car object
	 */
	public void add(Car c) {
		// append method adds the car object to the end of the linked list
		append(c);
	} // add method
	
} // UnsortedCarList class
