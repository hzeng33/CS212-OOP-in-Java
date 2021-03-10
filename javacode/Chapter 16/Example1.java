/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 16
 * http://www.cstutoringcenter.com
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Example1{
   public static void main(String args[]){
        StringTokenizer st;

        try{
           	BufferedReader br = new BufferedReader(
                     new FileReader("example1.txt"));

		//get line of the file
           	String line = br.readLine();

		//close the input stream
           	br.close();

           	double avg = 0.0;
           	int num = 0, count = 0;

		//default token is white space
            st = new StringTokenizer(line, ",");

            for(int i = 0; i < st.countTokens(); i++){
                 avg += Double.parseDouble(st.nextToken());
                 count++;
            }

		//calculate and print average
           	avg = avg/count;
           	System.out.println("Avg: " + avg);

        }catch(Exception e){}

   } //main
} //class
