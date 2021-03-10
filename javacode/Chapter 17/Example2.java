/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Example2{
	public static void main(String args[]){
		FoodStore fs[] = new FoodStore[3];
	
		fs[0] = new BestFoods("Best", 1956);
		fs[1] = new OldFoods("Old", 1944);
		fs[2] = new WholesomeFoods("Whole", 1987);
		
		for(int i = 0; i < 3; i++)
                System.out.println(fs[i] + "\nSlogan: " 
                        + fs[i].slogan() + "\n");
		
	} //main
} //class
