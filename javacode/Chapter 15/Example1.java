/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 15
 * http://www.cstutoringcenter.com
 */
public class Example1{
   public static void main(String args[]){
        String str = "2346512aa";
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            try{
                    sum += Integer.parseInt(str.charAt(i)+"");
            }catch(NumberFormatException nfe){
                    System.out.print("Yikes!  ");
            }finally{
                    System.out.println("i= " + i);
            }
        }

        System.out.println("Sum: " + sum);
   } //main
} //class
