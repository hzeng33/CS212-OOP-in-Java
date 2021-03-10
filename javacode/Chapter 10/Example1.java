/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example1{
	public static void main(String args[]){
		//1d array of integers of size 10 (indexes o to 9)
		int myarr[] = new int[10];

      		//give the array values by looping from 0 to 9
		for(int i = 0; i < 10; i++)
			myarr[i] = i % 3;

 		//display results
		for(int j = 0; j < 10; j++)
			System.out.print(myarr[j] + " ");
	}//main
} //class
