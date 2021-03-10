/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 8
 * http://www.cstutoringcenter.com
 */
public class Example3{
	static String word1 = "Cats";
	static String word2 = "Dogs";

	public static void main(String args[]){
		System.out.println("Before call:\nword1: " +
				word1 + "\nword2: " + word2);

		//call the switches() method
		switches(word1,word2);

		System.out.println("\nAfter call:\nword1: " +
				word1 + "\nword2: " + word2);
	}
	private static void switches(String w1, String w2){
		w1 = w2;
		w2 = "Changed!";
	} //method
} //class
