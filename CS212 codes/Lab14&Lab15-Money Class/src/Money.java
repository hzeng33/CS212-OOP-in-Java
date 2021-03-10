public class Money implements Comparable<Money> {
	
	private int dollars, cents;
	
	/**
	 * Constructor makes a call to {@link #Money(int, int)} 
	 * with (0,0) as parameters
	 */
	public Money() {
		//this(0,0);  //call the current class below.
		dollars=0;
		cents=0;
	}
	
	public Money(int dollars, int cents) {
		// TODO Fill this in
		// Hint: Use integer division by 100 to get dollars from cents
		// and use modulus to get cent values between 0 and 100 (mod by 100)
		if(cents>100) {
			dollars+=cents/100;
		}
		
		this.dollars=dollars;
		this.cents=cents%100;
	}
	


	public void add(Money other) {
		// TODO Fill this in
		// Hint: Add the cents first, check if you surpass 100 (check hint from 2-arg constructor),
		// then add dollars
		if(this.cents+other.cents > 100) {
			this.dollars+=(other.cents+this.cents)/100;
		}
		this.dollars+=other.dollars;
		this.cents=(other.cents+this.cents)%100;
		
	}

	@Override
	public int compareTo(Money other) {
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test the dollars in both first
		 * 2) If dollar values are equal, test
		 * cents in both
		 * 3) If both dollars and cents are equal return 0
		 * 
		 * Hint: compareTo can be viewed as a subtraction operation
		 */
		
		if(this.dollars<other.dollars) {
			return -1;
		} else if(this.dollars>other.dollars) {
			return 1;
		}
		else {//dollars are equal
			if(this.cents<other.cents) {
				return -1;
			} else if(this.cents>other.cents) {
				return 1;
			}
			else
				return 0; //both dollars and cents are equal
		}
	}
	
	@Override
	public boolean equals (Object other) {
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test if other is null
		 * 2) Test if other is of type Money
		 * 3) If the above tests pass, then cast other into
		 * type Money
		 * 4) Compare dollar and cents in both. 
		 * If equal return true, otherwise return false
		 */
		if (this == other) return true;  //check case if it compares to itself.
		if(other!=null && this.getClass().equals(other.getClass())) {
			// Start from step 3
			if(this.dollars == ((Money)other).dollars) {
				if(this.cents == ((Money)other).cents)
					return true;
				
				return false;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String c;
		if(cents<10) {
			c = "0" + cents;
		} else {
			c = "" + cents;
		}
		return "$ " + dollars + "." + c;
	}
	
	public int getCents() {
		return cents;
	}
	
	public int getDollars() {
		return dollars;
	}

}
