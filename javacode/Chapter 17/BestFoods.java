/**
 * BestFoods.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class BestFoods extends FoodStore {
	private String slogan = "The best food anywhere!";
	
	public BestFoods(String n, int o){
		super(n,o);
	}

	//implements the slogan() method from the interface:
	public String slogan(){
		return slogan;
	}
} //class
