// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//
//LinkedList is a list of ListNode.


/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

	/** First node in linked list - dummy node */
	private MoneyNode first = new MoneyNode(null);

	/** Last node in linked list */
	private MoneyNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this LinkedList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	public void append(Money d) {
		// TODO Code here for append
		MoneyNode newNode = new MoneyNode(d);
		last.next = newNode;
		last = newNode; 
		length++;

	} // method append(Money)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(Money d) {
		// TODO Code here for prepend
		MoneyNode newNode = new MoneyNode(d);
		MoneyNode p = first.next;  //new link point to the second node.
		newNode.next = p;  //now the second node after the d.
		
		if(p == null)  //if the LinkedList is empty
			last=newNode;
		first.next = newNode;
		length++;
		
	} // method prepend(Money)

	
	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	//This toString method is like a print method.
	public String toString() {
		MoneyNode p = first.next; //since the first node always be a dummy node, so points to the second node.
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}
	
	public float sumWallet() {
		
		float sum=0.0f;
		MoneyNode p = first.next;
		while(p != null) {
			if(p.data instanceof Bill)
				sum+=((Bill)p.data).getValue();
			else if(p.data instanceof Coin) {
				sum+= (((Coin)p.data).getValue())/100f;
				
				//System.out.println("Coin value:" + (((Coin)p.data).getValue())/100.0);
			}
			
			p=p.next;
			//System.out.println("sum: " + sum)
		}
		
		return sum;
	}

	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()
				|| length != ((MoneyList) other).length)
			return false;

		MoneyNode nodeThis = first;
		MoneyNode nodeOther = ((MoneyList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals


} // class LinkedList
