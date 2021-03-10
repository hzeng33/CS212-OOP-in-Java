
import javax.swing.*;
import java.awt.event.*;


/**
 * Handling the file menu.
 * @author Hannah Zeng
 * Lab section:11D
 *
 */
public class FileMenuHandler implements ActionListener {
   
   JFrame jFrame;
   
   public FileMenuHandler(CandleGUI jf) {
	    jFrame = jf;
   }
 

   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) {
    	//initialize JFileChooser chooser and set directory to current 
         JFileChooser chooser=new JFileChooser("./");  
         int returnVal = chooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) 
           Project4.openFile(chooser.getSelectedFile().getAbsolutePath());
      }
      else if (menuName.equals("Quit")) {
          System.exit(0);
      }
   

  } //method
    

}//class