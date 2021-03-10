/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 16
 * http://www.cstutoringcenter.com
 */
import java.io.*;
import java.util.StringTokenizer;
public class Example6{
	public static void main(String args[]) {
		try {
            //declare the file for reading
			BufferedReader br = new BufferedReader(
				new FileReader("input2.txt"));

      	      //declare the file for writing
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("output.txt"));

			//needed variables
			String line = "", line2 = "", name = "";
			String names[] = new String[5];
			double temp[] = new double[10];
			
			line = br.readLine(); //get first line
			StringTokenizer st;

			//loop through each students info
			for(int i = 0; i < 5; i++) {
				//both tokens are needed. The | token separates
				//the name from the grades, while the comma
				//separates each grade
				st = new StringTokenizer(line, "|,");

				//get the name
				name = st.nextToken();
				
				//get the 10 grades and parse to a double
				for(int j = 0; j < 10; j++) {
					temp[j] = 
                            Double.parseDouble(st.nextToken());
				}
	
				//begin outputting the needed information
				line2 = name + " grade information:"; 
				bw.write(line2);
				bw.newLine();

				//find the average grade
				line2= "Average grade: " + findAvg(temp) + ".";
				bw.write(line2);
				bw.newLine();
				
				//find the highest grade
				line2= "Highest grade: " + findMax(temp) + ".";
				bw.write(line2);
				bw.newLine();

				//find the lowest grade
				line2= "Lowest grade: " + findMin(temp) + ".";
				bw.write(line2);
				bw.newLine();
				bw.newLine();
	
				//go to the next line
				line = br.readLine();
			}

			//close both input and output streams
			br.close();
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	} //main

	//method to find the average grade in the given array
	public static double findAvg(double arr[]) {
		double avg = 0.0;
		for(int j = 0; j < 10; j++) {
			avg += arr[j];
		}
		avg /= 10;
		return avg;
	}

	//method to find the highest grade in the given array
	public static double findMax(double arr[]) {
		int index_max = 0;
		for (int i = 1; i < 10; i++) {
			if(arr[i] >= arr[index_max])
				index_max = i;
		}
		return arr[index_max];
	}

	//method to find the lowest grade in the given array
	public static double findMin(double arr[]) {
		int index_min = 0;
		for (int i = 1; i < 10; i++) {
			if(arr[i] <= arr[index_min])
				index_min = i;
		}
		return arr[index_min];
	}
} //class
