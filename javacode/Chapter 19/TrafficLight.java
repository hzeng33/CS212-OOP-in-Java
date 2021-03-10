/**
 * TrafficLight.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public enum TrafficLight{
	RED (60){
		public TrafficLight nextSignal(){ return GREEN; }
      },
	YELLOW (10) {
		public TrafficLight nextSignal(){ return RED; }
      },
	GREEN (60) {
		public TrafficLight nextSignal(){ return YELLOW; }
      };

	public abstract TrafficLight nextSignal();

	private final int secondsAtColor;

	TrafficLight(int secondsAtColor){
		this.secondsAtColor = secondsAtColor;
}

public int getSecondsAtColor(){ return this.secondsAtColor; }
}
