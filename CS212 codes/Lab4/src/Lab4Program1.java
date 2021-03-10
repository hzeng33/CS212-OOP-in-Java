import javax.swing.*;

/**
 * Two statements from the JOptionPane class take care of the input and output of Strings.
 * JOptionPane.showInputDialog(null, String) opens an input window containing the
 * message in the String parameter. The user may enter any String, and click OK. The
 * method returns the String.
 * JOptionPane.showMessageDialog(null, String) simply displays the String as a
 * message in a window and waits for the user to click OK.
 *
 * Remember that you cannot compare Stringswith the "==" operator. 
 *  You must use the equals method of class String, for example: 
 *  if(s1.equals(s2)) will compare String s1 with String s2
 */

public class Lab4Program1 {

	public static void main(String[] args) {
	
		String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
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
	
} // class Lab4Program1