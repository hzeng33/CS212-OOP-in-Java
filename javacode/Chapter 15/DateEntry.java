/**
 * DateEntry.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 15
 * http://www.cstutoringcenter.com
 */
public class DateEntry{
	private int month, day, year;	

	DateEntry(int m, int d, int y){
		//check for correct month
		if(m < 1 || m > 12){
			throw new MonthException("Month value out of range");
		}

		//for this program, user can enter between 1900 and 2019
		if(y < 1900 || y > 2019) {
			throw new YearException("Year value out of range");
		}

		//general day check
		if(d < 1)
			throw new DayException("Month needs at least 1 day");

		//check for the proper number of days
		switch (m) {
		//30 days as September, April, June and November
		case 9:
		case 4:
		case 6:
		case 11:
			if(d > 30)
				throw new DayException(
                       "Month can't have more  than 30 days");
			break;

		//February so check for a leap year
		case 2:
			boolean isLeap = false;

			//checking for leap year
			if(y % 4 == 0) {
				//is the year a century year (such as 1900)
				//if not, simple leap year
				if(y % 100 == 0) {
				   //if century year is also divisible by 400
					if(y % 400 == 0) {
						isLeap = true;
					}else {
						isLeap = false;
					}
				}else {
					//regular leap year such as 2004
					isLeap = true;
				}

				//leap years can’t have more than 29 days
				if(isLeap && d > 29)
					throw new FebruaryException(
		"February can't have more than 29 days in a leap year");
				else if((!isLeap) && d > 28)
					throw new FebruaryException(
	"February can't have more than 28 days in a non-leap year");
			}else {
				if(d > 28)
					throw new FebruaryException(
"February can't have more than 28 days in a non-leap year");
			}
			break;				
	
		//rest of calendar months
		default:
			if(d > 31)
				throw new DayException(
                      "Month can't have more  than 31 days");
			break;
		}		
		//otherwise, good on entries
		month = m;
		day = d;
		year = y;
	}
	
	//overloaded toString() method
	public String toString() {
		return "You entered: " + month + "/" + day + "/" + year;
	}
}
