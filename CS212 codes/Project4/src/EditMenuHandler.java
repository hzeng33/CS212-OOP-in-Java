
/*
 * EditMenuHandler class for new Menu "Edit".
 */

import javax.swing.*;
import java.awt.event.*;

public class EditMenuHandler implements ActionListener {
	
	JFrame jFrame;
	
	static float inputPrice; //to store input price
	
	public EditMenuHandler(JFrame jf) {
		jFrame=jf;
	}
	
	public void actionPerformed (ActionEvent event) {
		String menuName = event.getActionCommand();
		SortedCandleList newList = new SortedCandleList();
		
       //When user click menu item "Search" under the "Edit" menu, a window is shown and ask user to enter a price.
	    if(menuName.equals("Search")) {
		    inputPrice=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter a price: ")); 
	        
	        Project4.myGui.display2(newList.find(inputPrice));
	    	
	     }

  }//actionPerformed method
	
}//class
