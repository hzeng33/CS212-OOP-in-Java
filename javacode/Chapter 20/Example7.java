/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.ArrayDeque;
public class Example7{
	public static void main(String args[]){
		ArrayDeque<Integer> d1 = new ArrayDeque<Integer>(10);
		ArrayDeque<Integer> d2 = new ArrayDeque<Integer>(10);
		ArrayDeque<Integer> d3;
		
		//add elements
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) 
				d1.add(i);
			else
				d1.addFirst(i);
			
			d2.add(i);
		}
		
		//print deques
		System.out.println(d1);
		System.out.println(d2);
		
		//remove some data
		d1.remove(0);
		d1.remove(3);
		d2.remove();
		d2.remove(6);
		
		int size = d1.size();

		//create new deques
		d3 = new ArrayDeque<Integer>(size);

		//add items to d3
		for(int i = 0; i < size; i++) {
			int sum = d1.pollFirst() + d2.pollLast();
			d3.add(sum);
		}
		
		//print deques
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
}//main
} //class
