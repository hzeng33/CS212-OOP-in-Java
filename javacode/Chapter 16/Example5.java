/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 16
 * http://www.cstutoringcenter.com
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
public class Example5{
	public static void main(String args[]) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("output.txt"));

			Random d1, d2;

			//initialize new Random objects representing
			//two dice
			d1 = new Random();
			d2 = new Random();

			//array to track doubles, allows for using index 1-6
			int pairs[] = new int[7];
			int d1_roll = 0, d2_roll = 0;

			//roll the pair 1000 times		
			for(int i = 0; i < 1000; i++) {
				//roll the pair of dice (numbers 1 to 6)
				d1_roll = d1.nextInt(6) + 1;
				d2_roll = d2.nextInt(6) + 1;

				//write the two numbers
				bw.write(d1_roll + " - " + d2_roll);
				bw.newLine(); //go to next line
				
				//same number was rolled
				if(d1_roll == d2_roll)
					pairs[d1_roll] ++;
			}

			//close input stream
			bw.close();

			//print the results to the user
			for(int i = 1; i <= 6; i++)
				System.out.println("Pairs of " + i 
                    + "s were rolled " + pairs[i] + " times.");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	} //main
} //class
