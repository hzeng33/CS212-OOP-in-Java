public class Program1_1 {
/*
 * Read a file that contains integers, one per line, and put
 * them into a partially-filled array of short. Then print the
 * contents of the array.
 */  
   public static void main(String[] args) {

      short[] myArray = new short[10];
      int myArrayLength;
      String myFile = "program1.txt";
      
      myArrayLength = inputFromFile (myFile, myArray);
      
      for (int i=0; i< myArrayLength; i++)
         System.out.println(myArray[i]);
   }

   private static int inputFromFile(String filename, short[] numbers){
      TextFileInput in = new TextFileInput(filename);
      int lengthFilled = 0;
      String line = in.readLine();
      while ( lengthFilled < numbers.length && line != null ) {
         numbers[lengthFilled++] = Short.parseShort(line);
         line = in.readLine();
      } // while 
      if ( line != null ) {
         System.out.println("File contains too many numbers.");
         System.out.println("This program can process only " +
                            numbers.length + " numbers.");
         System.exit(1);
      } // if
      in.close();
      return lengthFilled; 
   }  // method inputFromFile 
   
}
