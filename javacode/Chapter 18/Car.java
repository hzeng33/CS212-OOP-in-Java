/**
 * Car.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 18
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Car extends Thread{
	private String model;
	private int chores = 1; //default value
	
	public Car(String m){
		model = m;
	}
	
	public Car(String m, int c){
		model = m;
		chores = c;
	}
	
	public void run(){
		Random r = new Random();
		
		try{
			//sleep 1 to 6 seconds
			Thread.sleep(r.nextInt(5000)+1000);
			startCar();

			//loop through based on the number of chores the
			//driver has to make
			for(int i = 0; i < chores; i++){
				//sleep 1 to 4 seconds
				Thread.sleep(r.nextInt(3000)+1000);
				drive(false); //more chores to do
				
				//sleep 3 to 13 seconds
				Thread.sleep(r.nextInt(10000)+3000);
				arriveDest(i+1);
			}
			
			//sleep 1 to 4 seconds
			Thread.sleep(r.nextInt(3000)+1000);
			drive(true); //no more chores

			//sleep 3 to 13 seconds			
			Thread.sleep(r.nextInt(10000)+3000);
			arriveHome();
		}catch(InterruptedException ie){
			System.out.println(model + " interrupted...");
		}
	}
	
	private void startCar(){
		System.out.println(model + " started");
	}

	//modified method from before
	private void drive(boolean home){
		if(home){
			System.out.println(model + " is heading home!");
		}else{
			System.out.println(model + " is running!");
		}
	}
	private void arriveDest(int n){
		System.out.println(model + " arrived at destination " + n + 
             " of " + chores);
	}
	private void arriveHome(){
		System.out.println(model + " arrived back home!");
	}
}
