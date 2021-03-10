/**
 * TestShape.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class TestShape {	
	public static void main(String args[]){
		Shape sh[] = new Shape[3];
		
		Square sq = new Square(4);
		Rectangle re = new Rectangle(5, 10);
		Circle c1 = new Circle(8);
		Shape c2 = new Circle(2);

		sh[0] = re;
		sh[1] = c1;
		sh[2] = sq;

		//initial run		
		for(int i = 0; i < 3; i++) {
			System.out.println("I'm a: " + sh[i]);	
			System.out.println("My area is: " + sh[i].area());
			System.out.println("My perimeter is: " 
                    + sh[i].perimeter());
		}
		
		sh[2] = c2;
		re.setLength(3);
		re.setWidth(3);

		sh[1] = new Square();

		//after changes		
		for(int i = 0; i < sh.length; i++) {
			System.out.println("I'm a: " + sh[i]);	
			System.out.println("My area is: " + sh[i].area());
			System.out.println("My perimeter is: " 
                    + sh[i].perimeter());
		}
	} //main
} //class
