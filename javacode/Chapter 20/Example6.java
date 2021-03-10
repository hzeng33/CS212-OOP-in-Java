/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.ArrayList;
public class Example6{
	public static void main(String args[]){
		ArrayList<Double> l1 = new ArrayList<Double>(10);
		ArrayList<Double> l2 = new ArrayList<Double>();
		ArrayList<Double> l3, l4;

		//add data
		for(double i = 10.0; i < 20.0; i+=1.0) {
			l1.add(i);
			l2.add(10.0-i);
		}

		//print l1 and l2
		System.out.println("L1: " + l1);
		System.out.println("L2: " + l2);

		//create new list
		l3 = new ArrayList<Double>();
		l3.addAll(l2);
		
		//print l3
		System.out.println("L3: " + l3);

		//remove some items
		l1.remove(5);
		l2.remove(5);
		l1.remove(7);
		l2.remove(7);

		//create a new list
		l4 = new ArrayList<Double>(10);
		l4.addAll(l1);
		l4.trimToSize();	

		//update lists
		l4.set(2, 500.0);
		l2.set(2, 400.0);
		l1.set(5, 900.0);

		Double d1, d2;
		d1 = l1.get(6);
		d2 = l2.get(2);

		if(d1 < d2) {
			System.out.println("LESS");
		}else {
			System.out.println("MORE");			
		}

		//print lists
		System.out.println("L1: " + l1);
		System.out.println("L2: " + l2);
		System.out.println("L3: " + l3);
		System.out.println("L4: " + l4);
}//main
} //class
