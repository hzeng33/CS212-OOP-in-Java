/**
 * NameAge.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class NameAge<A, B extends Number>{
	A name;
	B age;
	public NameAge(A a, B b){
		name = a;
		age = b;
	}	
	public String toString() {
		return this.name + “, “ + this.age + “ years old”;
	}
} //NameAge
