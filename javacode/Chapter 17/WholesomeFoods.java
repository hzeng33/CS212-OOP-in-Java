/**
 * WholesomeFoods.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class WholesomeFoods extends FoodStore {
	private String slogan = "Mmmmmm, delicious!";
	
	public WholesomeFoods(String n, int o){
		super(n,o);
	}

//implements the slogan() method:
	public String slogan(){
		return slogan;
	}
}
