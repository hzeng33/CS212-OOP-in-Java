/**
 * Example17.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example17{
	private static void swapElements(int arr[], int i, int j) {
		//Scanner
		Scanner s = new Scanner(System.in);
		
		//arrays
		String students[] = new String[5];
		double grades[] = new double[5];
		
		//prompt user for inputs
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter student name and grade: ");
			students[i] = s.next();
			grades[i] = s.nextDouble();
		}
		
		//find the average for the class
		System.out.println("The average for the class was: " 
				+ classAverage(grades));
		
		int highest = 0, lowest = 0;

		//method returns the index of the highest and lowest
		//grade respectively	
		highest = highestGrade(grades);
		lowest = lowestGrade(grades);
		
		//print the results of each
		System.out.println("The student with the best grade is "
				+ students[highest] + " with a grade of "
				+ grades[highest]);
		
		System.out.println("The student with the worse grade is "
				+ students[lowest] + " with a grade of "
				+ grades[lowest]);
	} //main

	//method to calculate the class average
	private static double classAverage(double[] g) {
		double avg = 0.0;
		for(int i = 0; i < g.length; i++)
			avg += g[i];		
		return (avg/5);
	}

	//method to find the index of the lowest grade in the class
	private static int lowestGrade(double[] arr) {
		double min = arr[0];
		int index, lowest = 0;
		
      for (index = 1; index < arr.length; index++)
		   if (arr[index] < min) {
			min = arr[index];
		   	lowest = index;
		   }
		return lowest;
	}

	//method to find the index of the lowest grade in the class
	private static int highestGrade(double[] arr) {
		   double max = arr[0];
		   int index = 0, highest = 0;
		   
         for (index = 1; index < arr.length; index++)
		      if (arr[index] > max) {
		    	  max = arr[index];
		    	  highest = index;
		      }
		   return highest;
	}
} //class
