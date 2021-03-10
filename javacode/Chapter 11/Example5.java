/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Example5{
      public static void main(String args[]){
              Random r = new Random();
 
		  //declare the arrays for the number and suit of the cards
              String number[] =
              {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
              String suit[] = {"Hearts","Diamonds","Clubs","Spades"};
             
 		  //array to handle the check whether the card has been
		  //dealt from the deck. The rows indicate the suits
		  //while the columns indicate the cards
              int cards[][] = new int[4][13];
 
              for(int i = 0; i < 5; i++){
                  int col = r.nextInt(13); //next card
                  int row = r.nextInt(4); //next suit
 
                  //in case of a duplicate:
                  while(cards[row][col] == 1){
                      row = r.nextInt(4); //next suit
                      col = r.nextInt(13); //next card
                  }
    
                  cards[row][col]++;
 
			//print the card to the screen
                  System.out.println(number[col] + " of "
                         + suit[row]);
              }
 
        //print out the array for a check:
              for(int row = 0; row < 4; row++){
                   for(int col = 0; col < 13; col++){
                       System.out.print(cards[row][col] + " ");
                   }
                   System.out.println();
              }
      } //main
} //class
