/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example6{
	public static void main(String args[]){
		Gen<Integer> g = new Gen<Integer> (15);
		Gen<Double> g2 = new Gen<Double> (15.0);
		Gen<String> g3 = new Gen<String> (“Hello”);

		//print data
		System.out.println(g.getData());
		System.out.println(g2.getData());
		System.out.println(g3.getData());
	} //main
} //class
