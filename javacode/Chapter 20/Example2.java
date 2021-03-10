/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class Example2{
	public static void main(String args[]){
		SimpleQueue queue = new SimpleQueue(10);

		//add some numbers to the queue
		for(int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}

		//print		
		System.out.println(queue);
		
		//remove the first 5 items
		for(int i = 0; i < 5; i++) {
			queue.dequeue();
		}

		//print again		
		System.out.println(queue);
		
		//add some more items
		queue.enqueue(99);
		queue.enqueue(888);
		queue.enqueue(765);
		
		//print again
		System.out.println(queue);

		//remove items
		queue.dequeue();
		queue.dequeue();
		
		//print again
		System.out.println(queue);
}//main
} //class
