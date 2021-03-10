/**
 * MainFraction.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 13
 * http://www.cstutoringcenter.com
 */
public class MainFraction{
	public static void main(String args[]){
		Fraction f1, f2;
		
		f1 = new Fraction();
		f2 = new Fraction(4,5);
		
		System.out.println(f1);
		System.out.println(f2);
		
		f1.setN(9);
		f1.setD(4);
		
		System.out.println("f1 + f2 = " + f1.add(f2));
		System.out.println("f1 - f2 = " + f1.subtract(f2));
		System.out.println("f1 * f2 = " + f1.multiply(f2));
		System.out.println("f1 / f2 = " + f1.divide(f2));
		
		if(f1.equals(f2)){
			System.out.println("They are equals!");
		}else{
			System.out.println("Not equals!");
		}
	} //main
} //class
