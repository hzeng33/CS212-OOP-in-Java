
import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author Jianhui Chen
 * @date 2 April, 2019
 * @Lab Section F
 */
public class CarGUI {

	/**
	 * 
	 * @param unsortedCarList: unsorted car list
	 * @param sortedCarList: sorted car list
	 */
	public static void printToGUI(CarList unsortedCarList, CarList sortedCarList) {
		
		// Create and set up the window.
		JFrame frame = new JFrame("My Car GUI");
		frame.setSize(1000, 500);
		frame.setLocation(200, 150);
		frame.setLayout(new GridLayout(1, 2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TextArea unsortedList = new TextArea("Unsorted Car Information:\n\n");
		TextArea sortedList = new TextArea("Sorted Car Information:\n\n");
		
		// Prevent the contents in GUI from being changed
		unsortedList.setEditable(false); 
		sortedList.setEditable(false); 
		
		// Put the text area onto container
		frame.getContentPane().add(unsortedList);
		frame.getContentPane().add(sortedList);
		
		// Put the data into content pane.
		unsortedList.append(unsortedCarList.toString());
		sortedList.append(sortedCarList.toString());
		
		// Display the window.
		frame.setVisible(true);
	}
}