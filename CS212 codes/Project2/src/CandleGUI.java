import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

/**
 * Candle GUI
 * @author Hannah Zeng
 * Lab section 11D
 *
 */
public class CandleGUI {
    
	/**
	 * A constructor accepts two CandleList. 
	 * @param unsortedCandleList :The unsorted CandleList.
	 * @param sortedCandleList : The sorted CandleList.
	 */
	public CandleGUI(CandleList unsortedCandleList, CandleList sortedCandleList) {
		createAndShowGUI (unsortedCandleList, sortedCandleList);
	}
	
	
	/**
	 * A GUI with one row and two columns.
	 * The first column displays the candles in the order read from candles.txt.
	 * The second column displays candles in sorted order.
	 * @param unsortedList :The unsorted CandleList.
	 * @param sortedList :The sorted CandleList.
	 */
	public static void createAndShowGUI(CandleList unsortedCandleList, CandleList sortedCandleList) {
		//Create and set up the window.
		JFrame frame = new JFrame("Project 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 370); //width, height
		frame.setLocation(200, 200); //x, y
		frame.setLayout(new GridLayout(1,2));
		frame.setTitle("Candles");
		
		TextArea unsortedList = new TextArea ("Unsorted Candles:\n");
		TextArea sortedList = new TextArea("Sorted Candles:\n");
		unsortedList.setEditable(false);
		sortedList.setEditable(false);
		
		//Put the text area into container.
		frame.getContentPane().add(unsortedList);
		frame.getContentPane().add(sortedList);
		
		//Put the data into ContentPane.
		unsortedList.append(unsortedCandleList.toString());
		sortedList.append(sortedCandleList.toString());
		
		//Display the window.
		frame.setVisible(true);
		
		
	}
}
