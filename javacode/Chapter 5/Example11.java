/**
 * Example11.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example11{
	public static void main(String args[]) {
		//Scanner for input
		Scanner s = new Scanner(System.in);

		//variables for month and day
		int m = 0, d = 0;
		
		//get month from user
		System.out.println("Enter month (1 to 12): ");
		m = s.nextInt();
		
		//while month is out of range, prompt again
		while (m < 1 || m > 12) {
			System.out.println("Enter month again: ");
			m = s.nextInt();
		}

		//use a switch on the month...
		//30 days as September, April, June and November
		//all the rest have 31
		//except February which has 28 and 29 on a leap year
		switch(m) {
		case 9:
		case 4:
		case 6:
		case 11:
			//month that has 30 days
			System.out.println("Enter day (1 to 30): ");
			d = s.nextInt();
			
			//while day out of range
			while (d < 1 || d > 30) {
				System.out.println("Enter day again: ");
				d = s.nextInt();
			}			
			break;
			
		case 2:
			//month has up to 29 days
			System.out.println("Enter day (1 to 29): ");
			d = s.nextInt();
			
			//while day out of range
			while (d < 1 || d > 29) {
				System.out.println("Enter day again: ");
				d = s.nextInt();
			}
			break;
			
		default:
			//month has 31 days 
			System.out.println("Enter day (1 to 31): ");
			d = s.nextInt();
			
			//while day out of range
			while (d < 1 || d > 31) {
				System.out.println("Enter day again: ");
				d = s.nextInt();
			}
		}
		
		//have month and day so figure out sign.
		if((m==1 && d>=20) || (m==2 && (d>=1 && d<=18))) {
			System.out.println("You are an Aquarius!");
			
		}else if((m==2 && d>=19 ) || (m==3 && (d>=1 && d<=20))) {
			System.out.println("You are a Pisces!");
		
		}else if((m==3 && d>=21) || (m==4 && (d>=1 && d<= 19))) {
			System.out.println("You are a Aries!");
		
		}else if((m==4 && d>= 20) || (m==5 && (d>=1 && d<=20))) {
			System.out.println("You are a Taurus!");
		
		}else if((m==5 && d>=21) || (m==6 && (d>=1 && d<=20))) {
			System.out.println("You are a Gemini!");
		
		}else if((m==6 && d>=21) || (m==7 && (d>=1 && d<=22))) {
			System.out.println("You are a Cancer!");
		
		}else if((m==7 && d>=23) || (m==8 && (d>=1 && d<=22))) {
			System.out.println("You are a Leo!");
		
		}else if((m==8 && d>=23) || (m==9 && (d>=1 && d<=22))) {
			System.out.println("You are a Virgo!");
		
		}else if((m==9 && d>=23) || (m==10 && (d>=1 && d<=22))) {
			System.out.println("You are a Libra!");
		
		}else if((m==10 && d>=23) || (m==11 && (d>=1 && d<=21))) {
			System.out.println("You are a Scorpio!");
		
		}else if((m==11 && d>=22) || (m==12 && (d>=1 && d<=21))) {
			System.out.println("You are a Sagittarius!");
		
		}else if((m==12 && d>=22) || (m==1 && (d>=1 && d<=19))) {
			System.out.println("You are a Capricorn!");
		}
		
	} //main
} //class