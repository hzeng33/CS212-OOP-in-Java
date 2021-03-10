/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.Stack;
public class Example4{
	public static void main(String args[]){
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<String> s2 = new Stack<String>();
		char c = 65; //A

		//add items
		for(int i = 0; i < 10; i++) {
			s1.push(i+10);
			s2.push(Character.toString(c++));
		}
		
		//print the stacks
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);

		//remove some data
		s1.pop();
		s1.pop();
		s2.pop();
		
		//print the stacks
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		
		//peek at data
		System.out.println("Top of S1: " + s1.peek());
		System.out.println("Top of S2: " + s2.peek());		
		
		//clear first stack
		while(!s1.empty())
			s1.pop();
		
		s2.pop();
		s2.pop();
		
		//print the stacks
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
}//main
} //class
