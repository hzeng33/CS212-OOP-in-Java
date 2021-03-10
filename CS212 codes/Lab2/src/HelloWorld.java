public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
       System.out.println("Hello, Hannah Zeng!");
        
       //create an array of size 10, put elements in and print out the each element of the array.
        int[] anArray;
        anArray=new int[10];
        int num=1;
        for(int i=0; i<anArray.length; i++) {
        	int sum=num*100;
        	anArray[i]=sum;
        	System.out.println("The element of index"+" "+i+" is"+" "+anArray[i]);
        	num++;
        }
        
        char[] copyFrom = {'d','e','c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
       // char[] copyTo = new char[7];
        
        //Use System.arraycopy method to copy elements from copyFrom to new array copyTo
       // System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        //Use copyOfRange method from java.util.Arrays to copy an array
        /*
         * the second parameter of the copyOfRange method is the initial index of the range 
         * to be copied, inclusively, while the third parameter is the final index of the 
         * range to be copied, exclusively. In this example, the range to be copied does not
         *  include the array element at index 9 (which contains the character a).*/
        char[] copyTo= java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
        
        int i = 3;
        i++;
        System.out.println(i);// prints 4
        ++i;			   
        System.out.println(i);// prints 5
        
        System.out.println(++i);// prints 6
        
        System.out.println(i++%3);// prints 6
        
        System.out.println(i);// prints 7
    }   
    
}
