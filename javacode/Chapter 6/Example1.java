/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
public class Example1{
   public static void main(String args[]){
      String word;

      //assign the string to the variable:
      word = "Alexander";

      //1. retrieve the length by calling the
      //length method:
      int length = word.length();
      System.out.println("Length: " + length);

      //2. use the case methods:
      System.out.println("toUpperCase: " + word.toUpperCase());
      System.out.println("toLowerCase: " + word.toLowerCase());

      //3. use the trim method to eliminate leading
      //or trailing white spaces:
      word = word.trim();
      System.out.println("trim: " + word);

      //4. check for a certain character using indexOf()
      System.out.println("indexOf('s'): " + word.indexOf('s'));

      //5. print out the beginning character using charAt()
      System.out.println("first character: " + word.charAt(0));

      //6. make the string shorter
      word = word.substring(0, 4);
      System.out.println("shorter string: " + word);

   } //main
} //class
