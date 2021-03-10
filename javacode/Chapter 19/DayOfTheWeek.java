/**
 * DayOfTheWeek.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public enum DayOfTheWeek{
	MONDAY (1){
		public DayOfTheWeek previous(){ return SUNDAY; }
		public DayOfTheWeek next(){ return TUESDAY; }
      },
	TUESDAY (2){
		public DayOfTheWeek previous(){ return MONDAY; }
		public DayOfTheWeek next(){ return WEDNESDAY; }
      },
	WEDNESDAY (3){
		public DayOfTheWeek previous(){ return TUESDAY; }
		public DayOfTheWeek next(){ return THURSDAY; }
      },
	THURSDAY (4){
		public DayOfTheWeek previous(){ return WEDNESDAY; }
		public DayOfTheWeek next(){ return FRIDAY; }
      },
	FRIDAY (5){
		public DayOfTheWeek previous(){ return THURSDAY; }
		public DayOfTheWeek next(){ return SATURDAY; }
      },
	SATURDAY (6){
		public DayOfTheWeek previous(){ return FRIDAY; }
		public DayOfTheWeek next(){ return SUNDAY; }
      },
	SUNDAY (7){
		public DayOfTheWeek previous(){ return SATURDAY; }
		public DayOfTheWeek next(){ return MONDAY; }
      };

	public abstract DayOfTheWeek previous();
	public abstract DayOfTheWeek next();

	private final int value;

	DayOfTheWeek(int value){
		this.value = value;
}

public int getValue(){ return this.value; }
}
