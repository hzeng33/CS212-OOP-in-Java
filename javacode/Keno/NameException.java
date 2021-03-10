/**
 * NameException.java
 * 
 * @author Alex Maureau
 * Reviewing Java
 * http://www.cstutoringcenter.com
 */
public class NameException extends IllegalArgumentException{
	public NameException(String gripe) {
		super(gripe);
	}
}