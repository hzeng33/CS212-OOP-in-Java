/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class Example4{
	public static void main(String args[]){
		A a = new A();
		B b = new B(2, 2);
		C c = new C(5, 3);

		//print method returns
		System.out.println(a.mysteryA());
		System.out.println(b.mysteryB());
		System.out.println(c.mysteryC());

		//make some changes
		b.setN1(5);
		c.setN2(5);
		a.setN1(b.getN2());
		a.setN2(c.getN2());
		
		//print method returns
		System.out.println(a.mysteryA());
		System.out.println(b.mysteryB());
		System.out.println(c.mysteryC());
	} //main
} //class
