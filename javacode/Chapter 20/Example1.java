/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class Example1{
	public static void main(String args[]){
		SimpleStack s = new SimpleStack(10);
		char c = 65; //A

		//add items to the stack
		for(int i = 0; i < 10; i++) {
			s.push(c);
			c++;
		}
		
		//print
		System.out.println(s);
		
		//remove some items
		for(int i = 0; i < 4; i++)
			s.pop();
		
		//print again
		System.out.println(s);
		
		//lowercase d
		c = 100;

		//add more items		
		for(int i = 0; i < 3; i++) {
			s.push(c);
			c++;
		}
		
		//print again
		System.out.println(s);
		
		//pop the stack entirely
		int size = s.size();
		for(int i = 0; i < size; i++)
			s.pop();
		
		if(s.empty())
			System.out.println("Good bye!");
	}//main
} //class
