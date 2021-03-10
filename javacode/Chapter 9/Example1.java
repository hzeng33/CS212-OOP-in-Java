/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 9
 * http://www.cstutoringcenter.com
 */
public class Example1{
	public static void Print(int n){
		//base case
		if(n < 1) return;

		Print(n-1); //recursive call

		System.out.println(n);
	} //Print

	public static void main(String args[]){
		Print(5);
	} //main
} //class
