/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 9
 * http://www.cstutoringcenter.com
 */
public class Example6{
	public static int fib( int n ){
		//base case:
		if( n <= 2 ) return 1;
		
		return fib(n-2) + fib(n-1);
	} //fib

	public static void main(String args[]){
		System.out.println(fib(3));
	} //main
} //class

