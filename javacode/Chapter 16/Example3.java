/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 16
 * http://www.cstutoringcenter.com
 */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
public class Example3{
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("example3.txt"));

			//read line from file and close stream
			String line = br.readLine();
			br.close();
			
			//tokenizer for the line (default token white space)
			StringTokenizer st = new StringTokenizer(line);
			
			String curr = "", temp = "";
			curr = st.nextToken(); //read first number
			System.out.print(curr + " "); //print first number

			//keep program running until there are no more tokens
			while(true) {
				//get next number
				temp = st.nextToken();
				
				//reached the last token so break out of loop
				if(!st.hasMoreTokens()) break;
				
				//if the current number does not equal the next
				//number, you have found a unique so adjust
				//curr variable and print
				if(!curr.equals(temp)) {
					curr = temp;
					System.out.print(temp + " ");
				}
			}						
			//make final comparison here
			if(!curr.equals(temp)) {
				System.out.print(temp + " ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	} //main
} //class
