import java.util.StringTokenizer;

public class Project1 {
    
	/**
	 * Read the information about a candle from a input.txt.
	 */
	public static String fileName = "input.txt";
	
	public static int count; //variable count will contain the actual size of the two arrays.
	
	public static void main(String[] args) {
		Candle[] arr = inputFromFile(fileName); //arr contains candles read from input.txt

		Candle[] arr2 = copyArray(arr); //create arr2 and copy arr to it.
		
		selectionSort(arr2, count); 
		
		CandleGUI gui =new CandleGUI(arr, arr2, count);
		
		
	} // main

	/**
	 * This method takes in text file and reads into the file. Parse out the
	 * information of the height, width, and price of each line and put these into
	 * candle array.
	 * 
	 * @param file:The input text from "input.txt" file
	 * @return An array of all candle objects
	 */
	public static Candle[] inputFromFile(String file) {
		int height = 0, width = 0;
		float price = 0f;
		Candle[] temp = new Candle[100];
		TextFileInput tfi = new TextFileInput(fileName);
		String line = tfi.readLine();
		count = 0;

		while (line != null) {
			StringTokenizer str = new StringTokenizer(line, ",");

			/**
			 * This if statement uses to see if a line has 3 tokens. If it does not have 3
			 * tokens, it will print out that line; otherwise,it will parse out the three
			 * information of the candle and put the candle object in an array.
			 */
			if (str.countTokens() != 3) {
				System.out.println(line);
			} else {
				//parse out the three pieces of information for the Candle using a StringTokenizer.
				height = Integer.parseInt(str.nextToken());
				width = Integer.parseInt(str.nextToken());
				price = Float.parseFloat(str.nextToken());
				
				//put them in candle array.
				Candle candle = new Candle(height, width, price);
				temp[count] = candle;
				count++;
			}
			//Refresh a line.
			line = tfi.readLine();
		}

		Candle[] actualArray = new Candle[count];
		for (int i = 0; i < count; i++) {
			actualArray[i] = temp[i];
		}

		return actualArray;
	}

	/**
	 * Copy an array to an new array
	 * @param array
	 * @return new array that has same elements as the old array.
	 */
	public static Candle[] copyArray(Candle[] array) {
		Candle[] copyTo = new Candle[100];
		for (int i = 0; i < array.length; i++)
			copyTo[i] = array[i];

		return copyTo;
	}
    
	/**
	 * Take in candle array and sort it by price.
	 * @param array:The array that needs to be sorted.
	 * @param arrsize:The size of the array.
	 */
	public static void selectionSort(Candle[] array, int arrsize) {
		for (int i = 0; i < arrsize-1; i++) {
			int lowerIndex = i;
			for (int j = i + 1; j < arrsize; j++)
				if (array[j].getPrice() < array[lowerIndex].getPrice())
					lowerIndex = j;

			if (!(array[i].equals(array[lowerIndex]))) {
				Candle temp;
				// Swapping.
				temp = array[lowerIndex];
				array[lowerIndex] = array[i];
				array[i] = temp;
			}
		}
	}//selectionSort

}
