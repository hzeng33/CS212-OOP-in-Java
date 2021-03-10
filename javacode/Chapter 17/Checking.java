/**
 * Checking.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Checking extends Account{
	//one argument constructor
	public Checking(double amt) {
		super(amt);
	}

	//overloaded toString() method which prints current balance
	public String toString() {
		return "Current balance in your " +
			this.getClass().getName() + " account is: $" + 
				getBalance();
	}

	//method to withdraw funds from the Checking account
	public void withdraw(double amt) {
		//get the current balance via inherited 
		//getBalance() method
		double bal = getBalance();
		
		//if the current balance minus the requested 
		//withdrawl amount will produce a negative value
		//print message and exit method
		if(amt > bal) {
			System.out.println("Overdrawn on your checking!");
			return;
		}
		
		//otherwise good check above and set the new balance
		//to the current balance minus the withdrawl amount
		//via the inherited setBalance() method
		setBalance(bal-amt);
	}

	//method to deposit funds to the Checking account
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

	//method to transfer funds to the Checking account
	//from the Savings account
	public void transfer(Savings s, double amt) {
		//get current balances
		double checking_balance = this.getBalance();
		double savings_balance = s.getBalance();

		//if the amount requested for transfer is larger
		//then the balance from the initiating account
		//error exists so return
		if(amt > savings_balance) {
		 System.out.println("Too much money for a S->C transfer!");
			return;
		}
		
		//good balance transfer request so update
		checking_balance += amt;
		savings_balance -= amt;

		//set respective amounts
		this.setBalance(checking_balance);
		s.setBalance(savings_balance);
	}

} //Checking
