/**
 * Example10.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
public class Example10{
      public static void main(String args[]){
            String s = args[0];
            int upper = 0, lower = 0, letter = 0, digit = 0, space = 0;
 
            //loop through the String to count the different
            //types of features in the String
            for(int i = 0; i < s.length(); i++){
                  if(Character.isUpperCase(s.charAt(i))) upper++;
                  if(Character.isLowerCase(s.charAt(i))) lower++;
                  if(Character.isDigit(s.charAt(i))) digit++;
                  if(Character.isLetter(s.charAt(i))) letter++;
                  if(Character.isWhitespace(s.charAt(i))) space++;
            }
           
            //display the result
            System.out.println("There are:\n" +
                        upper + " uppercase characters\n" +
                        lower + " lowercase characters\n" +
                        digit + " digit characters\n" +
                        letter + " letters\n" +
                        space + " white spaces.");
      } //main
} //class
