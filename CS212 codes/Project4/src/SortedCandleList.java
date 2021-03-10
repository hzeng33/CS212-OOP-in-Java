
/**
 * Sorted CandleList
 * @author Hannah Zeng
 * Lab section 11D
 *
 */
public class SortedCandleList extends CandleList{
    /**
     * No-argument constructor.
     */
	public SortedCandleList() {
		// System will automatically call the default constructor.
	}
	
	
	/**
	 * Add method
	 * @param c: Candle object
	 */
	public void add(Candle c) {
		//Create a new node.
		CandleNode newCandle = new CandleNode(c);
		CandleNode current = first.next;
		CandleNode previous= first;
		
		//Keep adding candle nodes to the CandleList and rearrange the positions. 
		while((current!= null) && (newCandle.data.getPrice()> current.data.getPrice())) {
			previous = current;
			current = current.next;
		}
		//Inserting candle node to a proper position in the list.
		newCandle.next = current;
		previous.next = newCandle;
	}
	
	/**
	 * This 'find' method uses to compare input price to each candle price 
	 * in the current sorted candle price, and add candles which have price 
	 * less or equal to the input price.
	 * @param price :candle price.
	 * @return  a new sorted candle list with prices less or equal to the 
	 *          input price.
	 */
	public SortedCandleList find(float price) {
		SortedCandleList newList = new SortedCandleList();
	    SortedCandleList sorted_list = Project4.sortedList;
		CandleNode current=sorted_list.first.next;
		CandleNode previous=sorted_list.first;
		
		while((current != null) && (current.data.getPrice() < price || current.data.getPrice()==price )) {
	            newList.append(current.data);
	            previous = current;
				current=current.next;
		}
		
		return newList;
		
	}//find method
	
	
		
		

	
	

}//class
