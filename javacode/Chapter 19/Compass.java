/**
 * Compass.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public enum Compass{
	NORTH ("N"),
	SOUTH ("S"),
	EAST ("E"),
	WEST ("W");

	private final String code;

	Compass(String code){
		this.code = code;
	}

	public String getDirection(){ return this.code; }
}
