import java.awt.GridLayout;
import javax.swing.*;        

public class Lab11 {
    
   public static void main(String[] args) {
        createAndShowGUI();
   }
   
   private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Lab 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 180,120);//width, height);
        frame.setLocation(200,200);//x, y);
        frame.setLayout(new GridLayout(2,1));

        JTextArea textArea = new JTextArea(5, 20); //5=row,20=columns, character number
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        JLabel label = new JLabel();
        frame.getContentPane().add(label);

        textArea.setText("The matrix should print here:\n"); //overwrite the content in the text area.
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        readAndDisplayMatrix(frame, textArea, label);
    }
   
   private static void readAndDisplayMatrix(JFrame myFrame, JTextArea myText,
                                            JLabel myLabel) {
   /*
    * Fill in this method.   
    * It should fill the text area with the matrix (as you did to a
    * message dialog in a previous lab, calculate the sum (code from
    * a previous lab) and set the text of the label to show the sum.
    * Re-display the JFrame using the setVisible(true) method. The
    * matrix is given here.
    */
   
   int[][] myMatrix = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
   int sum =0;
   for(int row=0; row<myMatrix.length;row++) {
	   for(int col=0;col<myMatrix[row].length;col++) {
		   myText.append(myMatrix[row][col]+" ");
		   sum=sum+myMatrix[row][col];
	   }
	   myText.append("\n");
   }
   
   myLabel.setText("The Sum is:"+sum);

   }

        
}