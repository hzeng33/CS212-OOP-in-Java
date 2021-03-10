/**
 * Account.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public abstract class Account{
	private double balance;

	//constructor, taking the amount of the opened account
	public Account(double amt) {
		balance = amt;
	}

	//get/set methods
	public double getBalance() { return balance; }
	public void setBalance(double amt) { balance = amt; }
	
	//abstract methods for withdrawing and depositing to an account
	public abstract void withdraw(double amt);
	public abstract void deposit(double amt);
} //Account
