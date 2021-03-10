/**
 * Store.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Store{
	public static void main(String args[]){
	
	MediaItem items[] = new MediaItem[5];
	
	for(int i = 0; i < 5; i++){
		try{
			if(i % 3 == 0)
				items[i] = new CD("Im a CD", 1993, i*3);
			else if(i % 3 == 1)
				items[i] = new DVD("Im a DVD", 1999, i*2);
			else
				items[i] = new VHS("Im old!", 1987, i*4);
		}catch(IllegalArgumentException iae){}
	}

	System.out.println("Inventory:");		
	for(int i = 0; i < 5; i++)
		System.out.println("Item: " + items[i] + "\n");
	} //main
} //class
