/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.LinkedList;
public class Example5{
	public static void main(String args[]){
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3;
		
		//add items
		for(int i = 0; i < 10; i++) {
			l1.addFirst(i+20);
			l2.addLast(i+1);
		}
		
		//print lists
		System.out.println("L1: " + l1);
		System.out.println("L2: " + l2);
		
		//work on l3
		l3 = new LinkedList(l2);
		l3.addAll(l1);

		//print l3
		System.out.println(l3);
		
		//poll data
		System.out.println("L1 head: " + l1.pollFirst());
		System.out.println("L1 tail: " + l1.pollLast());
		System.out.println("L2 head: " + l2.pollFirst());
		System.out.println("L2 tail: " + l2.pollLast());
		System.out.println("L3 head: " + l3.pollFirst());
		System.out.println("L3 tail: " + l3.pollLast());

		//print lists
		System.out.println("L1: " + l1);
		System.out.println("L2: " + l2);
		System.out.println("L3: " + l3);

		l1.offer(100);
		l2.offerFirst(200);
		l3.offerLast(300);
		
		//print lists
		System.out.println("L1: " + l1);
		System.out.println("L2: " + l2);
		System.out.println("L3: " + l3);
		
		//check for indices
		System.out.println(l1.indexOf(10));
		System.out.println(l2.indexOf(20));
		System.out.println(l3.indexOf(10));
}//main
} //class
