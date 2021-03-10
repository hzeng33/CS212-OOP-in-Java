/**
 * 
 * @author Jianhui Chen
 * @date 2 April, 2019
 * @Lab Section F
 */
public class Car {
	private String make;
	private String model;
	private int year;
	private int mileage;
	
	public Car(String make, String model, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", mileage=" + mileage + "]";
	}
	

	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

