/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example7{
   public static void main(String args[]){
	//declare 2d array of int values with 5 rows and 5 columns
	int myarr[][] = new int[5][5];

	//loop to insert values into array
	for(int r = 0; r < 5; r++){
		for(int c = 0; c < 5; c++){
			myarr[r][c] = r+c;
		}
	}

	int evens = 0, odds = 0;

	//loop to count odd or even numbers
	for(int r = 0; r < 5; r++){
		for(int c = 0; c < 5; c++){
			if(myarr[r][c] % 2 == 0) evens++;
            else odds++;
		}
	}

	//print desired message
	System.out.println("There are " + evens + " numbers and " 
           + odds + " odd numbers");

   } //main
} //class
