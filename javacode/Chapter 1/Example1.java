/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 1
 * http://www.cstutoringcenter.com
 */
public class Example1{
	public static void main(String args[]){

	    if(args.length != 2){
		System.out.println("First + Last name needed");
            System.exit(1);
          }

    	System.out.println("Hello " + args[0] + " " 
                + args[1]);
	} //main
} //class
