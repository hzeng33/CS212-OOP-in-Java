
/**
 * Candle GUI
 * @author Hannah Zeng
 * Lab section 11D
 */

import java.awt.*;
import javax.swing.*;

public class CandleGUI extends JFrame {
	
	   public CandleGUI() {
		   
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setSize(300, 370); //width, height
		   setLocation(400, 200); //x, y
		   createFileMenu();
		   
		   setTitle("Candles");
			
	       setVisible(true);
	   } //CandleGUI

	   public void createFileMenu( ) {
		      
		    JMenuBar menuBar  = new JMenuBar();
		    JMenu  fileMenu = new JMenu("File");
		    JMenu  editMenu = new JMenu("Edit");
		    FileMenuHandler fmh  = new FileMenuHandler(this);
		    EditMenuHandler emh = new EditMenuHandler(this);
            JMenuItem  item;
              
		    item = new JMenuItem("Open"); //Open menu item
		    item.addActionListener( fmh );
		    fileMenu.add( item );

		    fileMenu.addSeparator(); //add a horizontal separator line
		    
		    item = new JMenuItem("Quit");  //Quit menu item
		    item.addActionListener( fmh );
		    fileMenu.add( item );
		      
		    item = new JMenuItem("Search");  //Search menu item
		    item.addActionListener(emh);
		    editMenu.add(item);
		      
		    setJMenuBar(menuBar);
		    menuBar.add(fileMenu);
	        menuBar.add(editMenu);
	        
	   } //createFileMenu
	   
	   public static TextArea unsortedTextArea = new TextArea();
	   public static TextArea sortedTextArea = new TextArea();
	   
	/**
	 * To display the unsorted and sorted candle lists in GUI   
	 * @param unsortedCandleList : the candle list read from file.
	 * @param sortedCandleList : the sorted candle list.
	 */
	public void display(UnsortedCandleList unsortedCandleList, SortedCandleList sortedCandleList) {
		
		  setLayout(new GridLayout(1,2));
		  unsortedTextArea.setEditable(false);
		  sortedTextArea.setEditable(false);
		  
			//Put the text area into container.
		  getContentPane().add(unsortedTextArea);
		  getContentPane().add(sortedTextArea); 
			
			//Put the data into ContentPane.
			unsortedTextArea.append("Unsorted candles:\n\n"+ unsortedCandleList.toString());
			sortedTextArea.append("Sorted candles:\n\n"+sortedCandleList.toString());
			 setVisible(true);
	} //display method
	
	
	/**
	 * To display only the new sorted candle list.
	 * @param list :a sorted candle list
	 */
	public void display2(SortedCandleList list) {
		Project4.myGui.remove(unsortedTextArea);
		sortedTextArea.setEditable(false);
		sortedTextArea.setText("Candles at or below the price " + EditMenuHandler.inputPrice+" :\n\n");
		getContentPane().add(sortedTextArea);
		sortedTextArea.append(list.toString());
		
		setVisible(true);
		
	}//showNewList method
	
}//class
