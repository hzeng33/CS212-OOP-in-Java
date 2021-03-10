import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

public class CandleGUI {
	
	/**
	 * Create constructor to accept 2 arrays from Project1.
	 * @param array1: The unsorted candle array.
	 * @param array2: The sorted candle array.
	 * @param arraySize: The actual size of the two arrays.
	 */
	
	public CandleGUI(Candle[] array1, Candle[] array2, int arraySize) {
		createAndShowGUI (array1, array2, arraySize);
	}
	
	/**
	 * Create a GUI with one row and two columns.
	 * The first column displays the candles in the order read from input.txt.
	 * The second column displays candles in sorted order.
	 * 
	 * @param unsortArray -The candle array arr from Project1.
	 * @param sortedArray -The sorted candle array arr2 from Project1.
	 * @param size -array size which is the count from Project1.
	 */
	public static void createAndShowGUI(Candle[] unsortArray, Candle[] sortedArray, int size) {
		//create and set up the window.
		JFrame frame = new JFrame("Project1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 370); //width, height
		frame.setLocation(200,200); //x,y
		frame.setLayout(new GridLayout(1,2)); //1=row, 2=columns
		frame.setTitle("Candles");
		
		Container myContentPane = frame.getContentPane();
		TextArea firstArray = new TextArea();
		TextArea secondArray = new TextArea();
		myContentPane.add(firstArray, BorderLayout.WEST);
		myContentPane.add(secondArray, BorderLayout.EAST);
		firstArray.setText("Unsorted:\n");
		secondArray.setText("Sorted:\n");
				
		for(int i=0;i<size;i++) {
			firstArray.append(unsortArray[i]+"\n");
			secondArray.append(sortedArray[i]+"\n");
		}
		
		frame.setVisible(true);
		
		
	} //end of createAndShowGUI

}
