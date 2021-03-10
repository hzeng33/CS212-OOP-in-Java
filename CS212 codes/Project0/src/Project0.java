import javax.swing.*;

/**
 * 
 * @author Hannah Zeng
 * @date Sept 25,2019
 *
 */

public class Project0 {
	
	public static void main(String[] args) {
		
		String inputSentence;
		
		while(true) {   //while loop to keep user typing a sentence.
			
		inputSentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");
		
		//Type word "Stop" to terminate.
		if(inputSentence.equalsIgnoreCase("Stop"))
			System.exit(0);   
		
		//output JOptionPane telling user number of upper case 'E' and lower case 'e' in the sentence.
		JOptionPane.showMessageDialog(null, "Number of lower case e's:"+findLower(inputSentence)+"\nNumber of upper case e's:"+findUpper(inputSentence));
		
		}
	}
	
	/**
	 * Search through the sentence string and increase upperCount every time upper
	 * case 'E' is found.
	 * @param take in the sentence input from user.
	 * @return number of upper case 'E'.
	 */
	public static int findUpper (String sentence1) {
		int upperCount=0;
		for(int i=0; i<sentence1.length(); i++) {
			if(sentence1.charAt(i) == 'E')
				upperCount++;
		}
		
		return upperCount;
	}
	
	/**
	 * Search for lower case 'e' and increase lowerCount every time a 'e' is found.
	 * @param sentence input from user.
	 * @return number of lower case 'e'.
	 */
	public static int findLower (String sentence2) {
		int lowerCount=0;
		for(int i=0; i<sentence2.length(); i++) {
			if(sentence2.charAt(i) == 'e')
				lowerCount++;
		}
		
		return lowerCount;
	}
	

}
