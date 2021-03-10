/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 4
 * http://www.cstutoringcenter.com
 */
import javax.swing.JOptionPane;
public class Example5{
	public static void main(String[] args){
		String name = "";
		int age = 0;

            //get name from user with a JOptionPane		
		name = JOptionPane.showInputDialog(
                        null, "Please enter your name: ");

            //get age from user with a JOptionPane
		//need to parse as an int type
      age = Integer.parseInt(JOptionPane.showInputDialog(null,    "Please enter your age: "));
	
            //display message with a JOptionPane
	      JOptionPane.showMessageDialog(null, 
               "Hello " + name + ". You are " + age + " years old!");
	} //main
} //class

