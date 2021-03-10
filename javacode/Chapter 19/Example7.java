/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example7{	
	private static void print(NameAge[] arr) {
		for(NameAge curr : arr) {
			System.out.println(curr);
		}
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		NameAge<String, Integer> na[] = new NameAge[3];

		String name;
		Integer age;
		
		for( nti  = 0; i < 3; i++) {
			System.out.println(“Please enter your name: “);
			name = s.next();
			
			System.out.println(“Please enter your age: “);
			age = s.nextInt();
			
			na[i] = new NameAge<String, Integer> (name, age);
		}	
		
		print(na);
	} //main
} //class
