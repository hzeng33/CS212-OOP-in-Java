/**
 * MediaItem.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public abstract class MediaItem{
	private String title;  //global title variable
	private int year;  //global year variable
	private int quantity;  //global quantity variable

	public MediaItem(String t, int yr, int q){
		if(t == null)
			throw new IllegalArgumentException("No title given");
		else if(yr < 1900 || yr > 2019)
			throw new IllegalArgumentException("Bad year");
		else if(q < 0)
                  throw new IllegalArgumentException("Bad quantity");
		else{
                  title = t;
			year = yr;
			quantity = q;
            }
	} //constructor

	public String toString(){
	      return("Title: " + title 
	      	+ "\nYear: " + year 
	      	+ "\nQuantity: " + quantity);
      	} //toString()
} //class
