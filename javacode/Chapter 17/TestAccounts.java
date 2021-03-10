/**
 * TestAccounts.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class TestAccounts {	
	public static void main(String args[]){
		//declare new bank accounts
		Savings s = new Savings(100);
		Checking c = new Checking(500);

		//check both account balances
		System.out.println("Starting balances:");
		System.out.println("Savings: " + s.getBalance());
		System.out.println("Checking: " +c.getBalance());				
		//make a savings withdrawl
		s.withdraw(30);
		
		//make a checking deposit
		c.deposit(100);

		//check both account balances
		System.out.println(s);
		System.out.println(c);		

		//try a large withdrawl
		s.withdraw(1000);

		//try a large withdrawl
		c.withdraw(1000);

		//check both account balances
		System.out.println(s);
		System.out.println(c);
		
		//transfer to the savings from the checking
		s.transfer(c, 200);

		//check both account balances
		System.out.println(s);
		System.out.println(c);
		
		//transfer to the savings from the checking
		s.transfer(c, 550);

		//transfer to the checking from the savings
		c.transfer(s, 340);
		
		//check both account balances
		System.out.println(s);
		System.out.println(c);
	} //main
} //class
