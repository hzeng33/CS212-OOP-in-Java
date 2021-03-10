//Java library
import javax.swing.JOptionPane;

public class Lab5Program1 {
	
	public static void main(String[] args) {
		
		String fileName = args[0];
		
		String[] wordArray=inputFromFile(fileName);
		
		String isOrIsNot, inputWord;
		
		while(true) {
		// This line asks the user for input by popping out a single window
		// with text input
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		
		if(inputWord.equalsIgnoreCase("Stop"))
			System.exit(0);   //terminate the program.
		
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
	}
} //main
	
public static boolean wordIsThere(String findMe, String[] theList) {
		
		for(int i=0; i<theList.length; i++) {
			if(findMe.equals(theList[i]))
				return true;
		}
		return false;

	} // wordIsThere

 public static String[] inputFromFile (String file) {
	String[] tempArray = new String[20];
	TextFileInput tfi = new TextFileInput(file);
	String line = tfi.readLine();
    int count =0;
	while (line != null) {
		tempArray[count]=line;
		count++;
		line=tfi.readLine();
	}
	
	String[] actualArray = new String[count];
	for (int i=0; i<count; i++) {
		actualArray[i] = tempArray[i];
	}
	
	return actualArray;
  }//inputFromFile
 
}
