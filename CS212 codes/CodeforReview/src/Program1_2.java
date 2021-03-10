public class Program1_2 {
   /*
    * Read a file that contains integers, one per line, and put
    * them into a partially-filled array of short. Then print the
    * contents of the array.
    * 
    * Sort the array using SelectionSort, and print the sorted 
    * array.
    */  
   
   public static void main(String[] args) {

      short[] myArray = new short[10];
      int myArrayLength;
      String myFile = "program1.txt";
      
      myArrayLength = inputFromFile (myFile, myArray);
      
      System.out.println("Here is the original array:");
      for (int i=0; i< myArrayLength; i++)
         System.out.print(myArray[i]+" ");
      
      selectionSort (myArray, myArrayLength);
      System.out.println();
      
      System.out.println("Here is the sorted array:");
      for (int i=0; i< myArrayLength; i++)
         System.out.print(myArray[i]+" ");
      
      
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
      
   
   private static void selectionSort (short[] array, int length) { 
      for ( int i = 0; i < length - 1; i++ ) { 
         int indexLowest = i; 
         for ( int j = i + 1; j < length; j++ ) 
            if ( array[j] < array[indexLowest] ) 
               indexLowest = j;
         if ( array[indexLowest] != array[i] ) { 
            short temp = array[indexLowest];
            array[indexLowest] = array[i]; 
            array[i] = temp; 
         }  // if
      } // for i 
   } // method selectionSort 
   
}
