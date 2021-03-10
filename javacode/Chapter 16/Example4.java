/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 16
 * http://www.cstutoringcenter.com
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Example4{
   public static void main(String args[]){
	  //check for bad argument
        if(args.length == 0){
          System.out.println("String argument needed.");
          System.exit(1);
        }

	  //get the entered argument
        String word = args[0];

        try{
           BufferedWriter bw = new BufferedWriter(
                     new FileWriter("output.txt"));

           String ans = "";

	     //loop through the String entered and print the characters
           for(int i = 0; i < word.length(); i++){
               ans += word.substring(i);
               bw.write(ans);
               bw.newLine();
               ans = "";
           }

	     //close the output stream
           bw.close();

        }catch(Exception e){}
   } //main
} //class
