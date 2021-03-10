/**
 * Savings.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Savings extends Account{
	//one argument constructor
	public Savings(double amt) {
		super(amt);
	}

	//overloaded toString() method which prints current balance
	public String toString() {
		return "Current balance in your " +
			this.getClass().getName() + " account is: $" + 
				getBalance();
	}

	//method to withdraw funds from the Savings account
	public void withdraw(double amt) {
		//get the current balance via inherited 
		//getBalance() method
		double bal = getBalance();
		
		//if the current balance minus the requested 
		//withdrawl amount will produce a negative value
		//print message and exit method		
		if(bal-amt < 0.0) {
			System.out.println("Overdrawn on your savings!");
			return;
		}
		
		//otherwise good check above and set the new balance
		//to the current balance minus the withdrawl amount
		//via the inherited setBalance() method
		setBalance(bal-amt);
	}

	//method to deposit funds to the Savings account
	public void deposit(double amt) {
		//get the current balance via inherited 
		//getBalance() method
		double bal = getBalance();
	
		//if the user didn't deposit any amount, print message
		//and exit the method
		if(amt <= 0.0) {
			System.out.println("No amount requested!");
			return;
		}

		//otherwise good check above and set the new balance
		//to the current balance plus the deposit amount
		//via the inherited setBalance() method
		setBalance(bal+amt);
	}

	public void transfer(Checking c, double amt) {
		//get current balances
		double checking_balance = c.getBalance();
		double savings_balance = this.getBalance();

		//if the amount requested for transfer is larger
		//then the balance from the initiating account
		//error exists so return
		if(amt > checking_balance) {
		 System.out.println("Too much money for a C->S transfer!");
			return;
		}
		
		//good balance transfer request so update
		savings_balance += amt;
		checking_balance -= amt;

		//set respective amounts
		this.setBalance(savings_balance);
		c.setBalance(checking_balance);
	}

} //Savings
