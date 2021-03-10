/**
 * SelectionSort.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 12
 * http://www.cstutoringcenter.com
 */
public class SelectionSort{
	//method for selection sort
	private static void selectionSort(short arr[]){
		int length = arr.length;
		short temp = 0;
		
		for(int i = 0; i < length-1; i++){
			int indexMax = i;
			for(int j = i+1; j < length; j++){
				if(arr[j] > arr[indexMax]) indexMax = j;
			}

			//found the smallest elements index so swap here:
			if(arr[i] != arr[indexMax]){
		       temp = arr[i];
		       arr[i] = arr[indexMax];
		       arr[indexMax] = temp;
			}
		}
	} //method

	public static void main(String args[]){
		short nums[] = {5, 2, 3, 4, 7, 12, 9,
				         8, 9, 1, 9, 12, 16};
		
		//print the numbers before
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
		System.out.println();
		
		//result should be ascending
		selectionSort(nums);

		//print the numbers after
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	} //main
} //class
