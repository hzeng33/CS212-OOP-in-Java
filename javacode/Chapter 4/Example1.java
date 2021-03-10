/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 4
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example1{
	public static void main(String[] args){
	  String name = "";
	  int age = 0;

        //setup the Scanner		
	  Scanner input = new Scanner(System.in);

        //get first name
        System.out.print("Please enter your first name: ");
	  name = input.nextLine();
	
        //get age from user
	  System.out.print("Please enter your age: ");
	  age = input.nextInt();
		
        //display results
	  System.out.println("Thanks " + name + "!  You are " 
                + age + " years old!");
	} //main
} //class





