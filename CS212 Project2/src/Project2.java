import java.util.StringTokenizer;

/**
 * 
 * @author Jianhui Chen
 * @date 2 April, 2019
 * @Lab Section F
 */
public class Project2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String filename = args[0];
		TextFileInput myFile = new TextFileInput(filename);

		String line = new String(myFile.readLine());
		StringTokenizer myTokens = new StringTokenizer(line, ",");

		UnsortedCarList unsortedList = new UnsortedCarList();
		SortedCarList sortedList = new SortedCarList();

		/* The while loop keeps reading the text file, constructing the Car, And adding
		 * Car objects to the unsorted & sorted linked lists.
		 */
		while (true) {
			if (myTokens.countTokens() < 4) {
				// Print the invalid car information to the console
				System.out.println(line);
			} else {
				String make = myTokens.nextToken();
				String model = myTokens.nextToken();
				int year = Integer.parseInt(myTokens.nextToken());
				int mile = Integer.parseInt(myTokens.nextToken());
				Car newCar = new Car(make, model, year, mile);
				unsortedList.add(newCar);
				sortedList.add(newCar);
			}

			// Keep adding the car information to the linked list till the last line
			try {
				line = myFile.readLine();
				myTokens = new StringTokenizer(line, ",");
			}
			catch (Exception NullPointerException) {
				// Jumping out from the while loop after the last line in the file has been read
				break;
			}

		} // while loop

		// Print the Car list to GUI
		CarGUI.printToGUI(unsortedList, sortedList);

	} // main
} // class
