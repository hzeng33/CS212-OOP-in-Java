/**
 * CandleList class
 * @author Hannah Zeng
 * Lab section 11D
 *
 */

public abstract class CandleList {
	
	protected CandleNode first = new CandleNode(null);
	protected CandleNode last = first;
	protected int length=0;
	
	public CandleList() {
		first = new CandleNode(null);
		last = first;
		length=0;
	}
	
	/**
	 * Appends Candle object to the list.
	 * @param c: candle element to be appended.
	 */
	public void append(Candle c) {
		CandleNode newNode = new CandleNode(c);
		last.next = newNode;
		last= newNode;
		length++;
	} //append method
	
	public String toString() {
		CandleNode p = first.next;
		String returnString ="";
		while(p != null) {
			returnString += p.data + "\n";
			p=p.next;
		}
		
		return returnString;
	
	}//toString method
	

} //CandleList class
