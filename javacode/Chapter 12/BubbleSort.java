/**
 * BubbleSort.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 12
 * http://www.cstutoringcenter.com
 */
public class BubbleSort{
	//method to bubble sort an array
	private static void bubbleSort(double numbers[]){
		int length = numbers.length;
		double temp = 0;
		
		for (int i = length-1; i >= 0; i--) {
		    for (int j = 1; j <= i; j++) {
		      if (numbers[j-1] > numbers[j]) {
		        temp = numbers[j-1];
		        numbers[j-1] = numbers[j];
		        numbers[j] = temp;
		      }
		    }
		}
	} //method
	
	public static void main(String args[]){
		double nums[] = {5.5, 4.2, 3.3, 4, 
				     3.8, 9, 8.9, 1.02, 1.06};
		
		//print the numbers before
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
		System.out.println();

		//result should be ascending
		bubbleSort(nums);

		//print the numbers after
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	} //main
} //class
