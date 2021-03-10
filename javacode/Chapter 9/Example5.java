/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 9
 * http://www.cstutoringcenter.com
 */
public class Example5{
	public static int fact( int n ){
		//base case:
		if( n <= 1 ) return 1;
		
		//recursive call
		return n * fact(n-1);
	}

	public static void main(String args[]){
		System.out.println(fact(4));
	} //main
} //class

