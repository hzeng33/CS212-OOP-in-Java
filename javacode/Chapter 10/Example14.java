/**
 * Example14.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example14{
	private static int minArray(int[][] arr, int rCap, int cCap){
	   int min = arr[0][0];
	   for (int r = 0; r < rowCap; r++)
	     for (int c = 0; c < colCap; c++)
	       if (arr[r][c] < min) min = arr[r][c];
	   return min;
	}

	public static void main(String args[]) {
	   int x[3][5] = {{5,5,15,12,4}, 
			   {3,13,5,5,9}, 
	                  {6,1,9,23,12}};
	   System.out.println(minArray(x, 3, 5));
   	} //main
} //class
