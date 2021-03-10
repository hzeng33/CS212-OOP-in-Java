/**
 * Graph.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 13
 * http://www.cstutoringcenter.com
 */
public class Graph{
    //instance variables for point x and point y
    private double x, y;

    //default constructor. Sets points to origin
    public Graph(){
        x = y = 0.0;
    }

    //argument constructor, indicating points x and y
    public Graph(double a, double b){
        x = a;
	  y = b;
    }

    //set methods
    public void setX(double a){ x = a; }
    public void setY(double b){ y = b; }

    //get methods
    public double getX(){ return x; }
    public double getY(){ return y; }

    //method to find the distance between two points on a Graph
    public double distance(Graph g){
	   double tx = (g.x-x) * (g.x-x);
	   double ty = (g.y-y) * (g.y-y);
	   return Math.sqrt(tx + ty);
    }

    //method to find the midpoint between two points on a Graph
    public Graph midpoint(Graph g){
	   Graph temp = new Graph();
	   double tx = (g.x + x) / 2.0;
	   double ty = (g.y + y) / 2.0;

   temp.setX(tx);
   temp.setY(ty);

	   return temp;
    }

    //method to find the midpoint between two points on a Graph
    public void quadrant(){
	   if(x > 0 && y > 0) 
      System.out.println("Lies in Quadrant 1");
	   else if(x < 0 && y > 0) 
      System.out.println("Lies in Quadrant 2");
	   else if(x < 0 && y < 0) 
      System.out.println("Lies in Quadrant 3");
	   else if(x > 0 && y < 0) 
      System.out.println("Lies in Quadrant 4");
         else if(x == 0 && y > 0) 
      System.out.println("Lies on positive y-axis");
	   else if(x == 0 && y < 0)
      System.out.println("Lies on negative y-axis");
	   else if(x < 0 && y == 0) 
      System.out.println("Lies on negative x-axis");
	   else if(x > 0 && y == 0) 
      System.out.println("Lies on positive x-axis");
   else
     System.out.println("Lies at origin 0,0");
    }

    //overloaded toString() method
    public String toString() {
      	return "Currently at (" + x + ", " + y + ")";
    }

} //Graph
