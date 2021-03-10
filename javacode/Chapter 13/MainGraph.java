/**
 * MainGraph.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 13
 * http://www.cstutoringcenter.com
 */
public class MainGraph{
	public static void main(String args[]) {
		Graph g1, g2;
		g1 = new Graph();
		g2 = new Graph(5, -2);
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1.setX(-8);
		g2.setY(0);
		
		g1.quadrant();
		g2.quadrant();
		
		System.out.println(g1.midpoint(g2));
		System.out.println(g2.distance(g1));		
	}
} //class
