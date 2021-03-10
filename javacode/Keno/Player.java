/**
 * Player.java
 *
 * Class to hold name and bankroll information for the user
 * 
 * @author Alex Maureau
 * Reviewing Java
 * http://www.cstutoringcenter.com
 */
public class Player{
	//instance variables
	private int bankroll, starting_bankroll;
	private String name;

	/**
	 * Two argument constructor for name and bankroll
	 * @param n represents the name of the user
	 * @param b represents the starting bankroll of the user
	 */
	public Player(String n, int b){
		//if bankroll less than 0, error
		if(b <= 0) {
			throw new BankrollException("No money entered!");
		}
		//if name is null or 0 length, error
		if(n.length() == 0 || n == null) {
			throw new NameException("Name entry error!");
		}
		//good data
		name = n;
		bankroll = b;
		starting_bankroll = bankroll;
	}

	//get/set method for bankroll.
	public int getBankroll() { return bankroll; }
	public int getStartingBankroll() { return starting_bankroll; }
	public void setBankroll(int amt) {
		bankroll += amt;
	}

	//overloaded toString method, printing the name and
	//remaining bankroll of the user
	public String toString() {
		return name + ", you have $" + bankroll + " left";
	}
} //Player