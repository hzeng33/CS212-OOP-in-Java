/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example6{
   public static void main(String args[]){
	//declare 2d array with 2 rows and 3 columns
	int myarr[][] = new int[2][3];

	//loop through the array and insert values
	for(int r = 0; r < 2; r++){
		for(int c = 0; c < 3; c++){
			myarr[r][c] = r*c+1;
		}
	}

	//loop through array to print the values
	for(int r = 0; r < 2; r++){
		for(int c = 0; c < 3; c++){
			System.out.print(myarr[r][c] + "\t");
		}
		System.out.println("");
	}

   }//main
} //class
