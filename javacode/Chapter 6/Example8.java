/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.StringTokenizer;
public class Example8{
  public static void main(String args[]){
        String s = "What on earth is going on here?";

        //by default, a white space:
	  StringTokenizer st = new StringTokenizer(s);

        //when there are still more tokens, print out the next one:
	  while(st.hasMoreTokens())
		System.out.println(st.nextToken());
  } //main
} //class
