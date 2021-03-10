/**
 * Unsoerted CandleList
 * @author Hannah Zeng
 * Lab section 11D
 *
 */
public class UnsortedCandleList extends CandleList {
    /**
     * No-argument constructor.
     */
	public UnsortedCandleList() {
		// System will automatically call the default constructor.
	
	}
	
	/**
	 * Add method uses to add new node to the list.
	 * @param c :Candle object.
	 */
	public void add(Candle c) {
		//add it to the end of the list by calling the append method in CandleList.
		append(c);
		
	} // add method
	
	

} //UnsortedCandleList class
