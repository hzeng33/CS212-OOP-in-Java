/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example8{
   public static void main(String args[]){
		//declare the array. We are ignoring index 0
		//in both the row and column
		int table[][] = new int[11][11];
		
		//fill the values of the table
		for(int r = 1; r <= 10; r++) {
			for(int c = 1; c <= 10; c++) {
				table[r][c] = r*c;
			}
		}
		
		//print the table's top row
		System.out.print("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n");

		for(int r = 1; r <= 10; r++) {
			//print the side number in the row
			System.out.print(r + "\t");
			for(int c = 1; c <= 10; c++) {
				//print the actual number in the table
				System.out.print(table[r][c] + "\t");
			}
			//go to next line
			System.out.println();
		}
   } //main
} //class
