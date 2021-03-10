/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 16
 * http://www.cstutoringcenter.com
 */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;

public class Example2{
	//method to calculate the min value in an array
	private static int min(int[] n){
		int m = n[0];
		for(int i = 1; i < n.length; i++)
			if(n[i] < m) m = n[i];
		return m;
	} //min

	//method to calculate the max value in an array	
	private static int max(int[] n){
		int m = n[0];
		for(int i = 1; i < n.length; i++)
			if(n[i] > m) m = n[i];
		return m;
	} //max

	//method to calculate the mean value of an array
	private static double mean(int[] n){
		int sum = 0;
		for(int i = 0; i < n.length; i++)
			sum += n[i];
		
		return (sum / n.length ); 
	} //mean
	
	public static void main(String args[]){
		try{
                  //declare the file for reading
			BufferedReader br = new BufferedReader(
					new FileReader("example2.txt"));

			String line = br.readLine();  //get the line
			br.close();  //close the file
			
            //declare the tokenizer
			StringTokenizer st = new StringTokenizer(line, ",");
			
                  //array size is the number of tokens in the file
			int[] nums = new int[st.countTokens()];
			
	            //place the numbers in the array
			for(int i = 0; i < nums.length; i++){
				nums[i] = Integer.parseInt(st.nextToken());
			}

			//now call methods
			System.out.println("Min: " + min(nums));
			System.out.println("Max: " + max(nums));
			System.out.println("Mean: " + mean(nums));	
		}catch(Exception e){
			System.out.println("whoops!" + e);
		}
	} //main
} //class
