/**
 * LinkedList.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class LinkedList {
   	private Node head, tail;
   	private int size;

   	public LinkedList() {
     		head = tail = null; size = 0; 
   	}

   	public int size(){ return size; }
   	public boolean empty(){ return size == 0; }

   	public void addHead(Object d) {
     		Node n = new Node(d, head);
     		head = n;
     		size++;
     		if (tail == null) tail = head;
   	}

   	public void addTail(Object d) {
     		Node n = new Node(d, null);
     		if (tail == null) head = tail = n;
     		else {
        		tail.setNext(n);
        		tail = n;
     		}
     		size++;
   	}

   	public Object removeHead() {
      	if (empty())
           		throw new RuntimeException("Empty List");
      	
		//temporary node is the current head
      Node n = head;

	//new head node is the current head’s next
      	head = head.getNext();

      	if (head == null) tail = head;
      	size--;
      	return n.getData();
}

public Object removeTail() {
     	     if (empty()) 
          throw new RuntimeException("Empty List");
	     
		//start at the head
           	Node n = head;
	     
		//while you aren’t at the tail node, keep going
	     	while(n.getNext() != tail) {
	    		n = n.getNext();
	     	}

		//tail is now the found node	     
	     	tail = n;

		//the tail has no next so set to null
	     	tail.setNext(null);

		//decrease size
	     	size--;

	     	return n.getData();
}

   	public String toString() {
      	String ans = "";
      	Node n = head;
      
      	while (n != null) {
        		ans += n.getData();
        		if (n == tail) ans += " -> ///";
        		else ans += " -> ";
        		n = n.getNext();
      	}
      	return ans;
   	}
} //class
