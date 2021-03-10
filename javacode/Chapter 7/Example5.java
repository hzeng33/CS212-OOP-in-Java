/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
public class Example5{
	public static void main(String args[]){
		int i = 1;
		int mystery = 0;

		for(i = 1; i < 9; i++) {
			mystery ++;
		}
		System.out.println("i= " + i);
		
		for(i = i; i > 0; i--) {
			mystery ++;
		}
		System.out.println("i= " + i);

		System.out.println("mystery= " + mystery);	
	} //main
} //class