/**
 * OldFoods.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class OldFoods extends FoodStore{
	private String slogan = "The oldest food store around!";
	
	public OldFoods(String n, int o){
		super(n,o);
	}

//implements the slogan() method:
	public String slogan(){
		return slogan;
	}
}
