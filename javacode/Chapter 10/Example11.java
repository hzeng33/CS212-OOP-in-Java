/**
 * Example11.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example11{
        public static void main(String[] args){
                String str[] = new String[5];

                for(int i = 0; i < str.length; i++)
                        str[i] = new String("Hello " + i);

                //perform a small change:
                str[0] = str[3];

                for(String s : str)
                        System.out.println(s);
        } //main
} //class
