/**
 * 
 * @author Jianhui Chen
 * @date 2 April, 2019
 * @Lab Section F
 */
public abstract class CarList {

	protected CarNode first = new CarNode(null);
	protected CarNode last = first;
	protected int length = 0;

	public CarList() {
		first = new CarNode(null);
		last = first;
		length = 0;
	}

	/**
	 * 
	 * @param c: Car object
	 */
	public void append(Car c) {
		CarNode newNode = new CarNode(c);
		last.next = newNode;
		last = newNode;
		length++;
	} // method append

	public String toString() {
		CarNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + "\n";
			p = p.next;
		}
		return returnString; 
	} // toString method
	
} // class CarList
