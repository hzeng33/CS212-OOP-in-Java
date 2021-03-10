/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class Example3{
	public static void main(String args[]){
		LinkedList ll = new LinkedList();

		//add items to front
		for(int i = 0; i < 6; i++) {
			ll.addHead(i);
		}

		//add items to end
		for(int i = 7; i < 12; i++) {
			ll.addTail(i);
		}

		//print
		System.out.println(ll);
		
		//remove some items from the front and back
		ll.removeHead();
		ll.removeHead();
		ll.removeHead();

		ll.removeTail();
		ll.removeTail();

		//print again
		System.out.println(ll);
		
		//add some items to the end
		ll.addTail("Apple");
		ll.addTail("Grape");
		ll.addTail("Orange");

		//print again		
		System.out.println(ll);

		//remove elements from list
		int size = ll.size();
		for(int i = 0; i < size; i++)
			ll.removeHead();

		if(ll.empty())
			System.out.println("Good-bye!");
}//main
} //class
