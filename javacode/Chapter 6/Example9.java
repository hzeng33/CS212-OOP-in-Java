/**
 * Example9.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.StringTokenizer;
import java.util.Scanner;
public class Example9{
	public static void main(String args[]){
		//Scanner
		Scanner s = new Scanner(System.in);
		
		//variables
		String entry;
		short n1, n2, n3, n4;
		
		//get input from user
		System.out.println("Enter 4 numbers separated by " + 
                   "a comma or space: ");
		entry = s.nextLine();
		
		//set the tokenizer for either a space or a comma
		StringTokenizer st = new StringTokenizer(entry, ", ");
		
		//not enough numbers entered so exit
		if(st.countTokens() < 4)
			System.exit(1);
		
		//get the entered numbers and parse them
		n1 = Short.parseShort(st.nextToken());
		n2 = Short.parseShort(st.nextToken());
		n3 = Short.parseShort(st.nextToken());
		n4 = Short.parseShort(st.nextToken());

		//output the sum
		System.out.println("The sum is: " + (n1+n2+n3+n4));
	} //main
} //class

