
/*
 * This class shows the difference between length and length().
 */

public class ToDifferentiate {
	
	public static void main(String[] args) {
		
		// Here array is the array name of int type 
        int[] array = new int[4]; 
        System.out.println("The size of the array is " + array.length); 
  
        // Here str is a string object 
        String str = "You have exam today Yooo!"; 
        System.out.println("The size of the String is " + str.length()+"\nThe last character in string is "+ str.charAt(24)); 
        
     // Here str1[0] pointing to a string i.e. GEEKS 
        String[] str1 = { "SMILE", "FOR", "YOURSELF" }; 
        System.out.println(str1[0].length());
    
	
	} 
	

}//class
