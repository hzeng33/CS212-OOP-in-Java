/**
 * Example9.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
public class Example9{
	public static void main(String args[]){
		int sum = 0, t = 1;
		int n = 5;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				//will correctly multiply the i value
				//(the current n), n times as needed.
				t *= i;
			}
			sum += t; //add the desired value
			t = 1; //reset t
		}
		
		System.out.println("The sum is: " + sum);
	} //main
} //class
