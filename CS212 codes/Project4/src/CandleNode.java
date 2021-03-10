/**
 * CandleNode class
 * @author Hannah Zeng
 * Lab section:11D
 *
 */

public class CandleNode {
	
	protected Candle data;
	protected CandleNode next;
	
	/**
	 * A one-argument constructor which takes a Candle as a parameter.
	 * @param c: Candle object
	 */
	public CandleNode (Candle c) {
		data = c;
		next = null;
	} //constructor


}//CandleNode class
