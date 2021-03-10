
public class Demo {
	
	public static void main(String[] args) {
		// LAB 14
		Money m1 = new Money(), m2= new Money(6,5);
		System.out.println(m1.getCents());
		System.out.println(m2.getDollars());
		System.out.println(m2);
		System.out.println(m1.compareTo(m2)); //-1 because m1 less than m2
		System.out.println(m1.equals(m2));
		
		// LAB 15
		m1 = new Money(4,87);
		System.out.println(m1.toString());

		m2 = new Money(5,243);
		m1.add(m2); //m1 is "the this"
		System.out.println(m1);
	
		
	} //main
	
}
