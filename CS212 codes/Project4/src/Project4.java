import java.util.*;
import java.util.StringTokenizer;

/**
 * Project 2
 * @author Hannah Zeng
 * Lab section 11D
 *
 */
public class Project4 {
	
	public static CandleGUI myGui;
	public static SortedCandleList sortedList=new SortedCandleList();
	public static UnsortedCandleList unsortedList = new UnsortedCandleList();
	
	
	public static void main(String[] args) {
		
		myGui = new CandleGUI();
			
	}//main
	
	
	public static void openFile(String fileName) {
		
	    TextFileInput tfi = new TextFileInput(fileName);
		String line = tfi.readLine();
		  
		while(line != null) {
				
				StringTokenizer myToken = new StringTokenizer(line, ",");
				
				/**
				 * Check if a line has 3 tokens. If it does not have 3 tokens, it will print
				 * out the line; otherwise, it will parse out information of a candle and 
				 * put them in a candle object.
				 */
				if (myToken.countTokens() != 3) {
					System.out.println(line);
				} else {
					//parse out the three pieces of information for the Candle using a StringTokenizer.
					int height = Integer.parseInt(myToken.nextToken());
					int width = Integer.parseInt(myToken.nextToken());
					float price = Float.parseFloat(myToken.nextToken());
					
					//put them in candle object.
					Candle candle = new Candle(height, width, price);
					
					unsortedList.add(candle);
					sortedList.add(candle);	
				}
				//Refresh a line.
				line=tfi.readLine();
					
			}//while loop 
		
		//Display the unsorted and sorted lists in GUI.
		myGui.display(unsortedList,sortedList);
		
    }//openFile method
	

}

	
	

