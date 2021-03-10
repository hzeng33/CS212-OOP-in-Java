/**
 * FoodStore.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public abstract class FoodStore implements Slogan{
	private String name;
	private int opened;
	
	public FoodStore(String n, int o){
		if(n == null)
			throw new IllegalArgumentException("No name given!");
		else if(o < 1900 || o > 2019)
			throw new IllegalArgumentException("Bad opening!");
		else{
			name = n;
			opened = o;
		}
	} //constructor
	
	public String toString(){
		return("Name: " + name + "\nOpened: " + opened);	
	}
} //class
