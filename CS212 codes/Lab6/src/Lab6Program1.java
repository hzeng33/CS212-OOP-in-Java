//Java library
import javax.swing.JOptionPane;

public class Lab6Program1 {
	
	public static void main(String[] args) {
		String fileName = args[0];
		int[] intArray=new int[100];
		int actualSize = inputFromFile(fileName, intArray);
		
		JOptionPane.showMessageDialog(null, "The sum is"+" "+sum(intArray,actualSize)+
				"\n The average is"+" "+average(intArray, actualSize));
	
} //main
	
    public static int sum(int[] numArray, int actualSize) {
    	int sum=0;
    	for(int i=0; i<actualSize;i++)
    		sum += numArray[i];
    	
    	return sum;
    }
    
    public static double average(int[] numArray, int actualSize) {
    	return sum(numArray, actualSize)/(double)actualSize;
    }

   public static int inputFromFile (String file, int[] numArray) {
	   TextFileInput tfi = new TextFileInput(file);
	   String line = tfi.readLine();
       int count =0;
	   while ((line!=null) && (count<numArray.length)) {
		   numArray[count]=Integer.parseInt(line);
		   count++;
		   line=tfi.readLine();
	   }
	   
	   if(line!= null) {
		   System.out.println("Too many numbers");
		   System.exit(1);
	   }
	 return count;
	}
   
}