/**
 * MathClass.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class MathClass extends MathOps{
	//two argument constructor, taking in the values for n1 and n2
	public MathClass(double n1, double n2){
		super(n1, n2);
		setN1(n1-3);
	}

	//mystery method
	public void mystery3() {
		System.out.println("It's a mystery!");
		setN2(6);
		System.out.println(mystery());
	}

	//another mystery method
	public void mystery4() {
		System.out.println("It's a bigger mystery!");
		setN1(12);
		System.out.println(mystery2());
	}
}
