/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 4
 * http://www.cstutoringcenter.com
 */
import javax.swing.JOptionPane;
public class Example6{
	public static void main(String[] args){
		double num1, num2, num3;
		double avg = 0.0;

	//get first number and parse as a double		
	num1 = Double.parseDouble(
          JOptionPane.showInputDialog("Please enter 1st number:"));
		
	//get second number and parse as a double	
	num2 = Double.parseDouble(
          JOptionPane.showInputDialog("Please enter 2nd number:"));
	
	//get last number and parse as a double		
	num3 = Double.parseDouble(
          JOptionPane.showInputDialog("Please enter 3rd number:"));
	
	//find the average		
	avg = (num1+num2+num3)/3.0;
		
	JOptionPane.showMessageDialog(null, "The average is: " + avg);	
	} //main
} //class
