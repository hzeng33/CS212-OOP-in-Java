/**
 * Example15.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example15{
        public static void main(String[] args){
		char[] arr = {'a','b','c','d','e'};
		char[] arr2 = new char[5];

		//first action
		for(int i = 0; i < 5; i++)
			arr2[i] = arr[4-i];
		
		printArr(arr2);
		
		//second action
		for(int i = 1; i < 3; i++)
			arr2[i] = arr[2-i];
			
		printArr(arr2);
		
		//third action
		arr[1] = arr[3] = arr[4];
		
		printArr(arr);
		
		//final action
		arr2[0] = arr[1];
		arr[2] = arr2[1];
		arr[4] = arr2[4];
		
		printArr(arr2);
	} //main

	//method to print the contents of an array
	private static void printArr(char[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
} //class
