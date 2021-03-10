import java.util.StringTokenizer;

public class TwoDimArray {

	public static int[][] myArray;
	
	public static void main(String[] args) {
		String fileName = args[0];
		myArray=fillArray(fileName);
		printArray(myArray);
		System.out.println();
		printArrayEven(myArray);
	}//main
	
	public static int[][] fillArray(String myFile){
		TextFileInput tfi=new TextFileInput(myFile);
		String line=tfi.readLine();
		StringTokenizer myTokens=new StringTokenizer(line,",");
		int row=Integer.parseInt(myTokens.nextToken());
		int col=Integer.parseInt(myTokens.nextToken());
		
		int[][] arr=new int[row][col];
		for(int i=0; i<row; i++) {
			line=tfi.readLine();
			myTokens=new StringTokenizer(line, ",");
			
			for(int j=0;j<col;j++)
				arr[i][j]=Integer.parseInt(myTokens.nextToken());
		}
		
		return arr;	
	}//fillArray
	
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}//printArray
	
	private static void display (int num){
		if(num<10)
			System.out.print(num+"  ");
		else
			System.out.print(num+" ");
	}//display
	
	private static void printArrayEven(int[][] theArray){
		for(int i=0; i<theArray.length;i++) {
			for(int j=0;j<theArray[i].length;j++) {
				if(theArray[i][j]%2==0)
					display(theArray[i][j]);
				else
					System.out.print(""+"*"+"  ");
			}
			System.out.println();		
		}
	}//printArrayEven
	
}
