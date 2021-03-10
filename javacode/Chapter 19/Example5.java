/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example5{
	private static <A, B extends Number> void mystery(A a[], B b[]) {
		int sizeA = a.length, sizeB = b.length;
		
		for(int i = sizeA-1; i >= 0; i--) {
			System.out.print(a[i]);
		}		
		System.out.println();
		
		for(int j = 0; j < sizeB; j++) {
			System.out.print(b[j]);
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Character arr[] = {'o', 'l', 'l', 'e', 'H'};
		Integer arr2[] = {9, 0, 2, 1, 0};
		
		mystery(arr, arr2);
	} //main
} //class
