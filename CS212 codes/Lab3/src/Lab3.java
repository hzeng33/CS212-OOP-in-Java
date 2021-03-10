public class Lab3{
	
	public static void main(String[] args) {
		float fahrenheit, centigrade;
		fahrenheit =(float)98.6;
		centigrade = 5/9f*(fahrenheit - 32);
		System.out.println ("Centigrade is:"+ centigrade);
		
		for(fahrenheit=0.0f; fahrenheit<=40.0; fahrenheit+=5) {
			centigrade =5/9f*(fahrenheit-32);
			System.out.println("Centigrade will be"+ centigrade);
		}
		
		System.out.println("The following is while loop output.");
		
		fahrenheit=0.0f;
		while(fahrenheit<= 40) {
			centigrade = 5/9f*(fahrenheit-32);
			System.out.println("Centigrade will be"+ centigrade);
			
			fahrenheit+=5.0f;
		}
	}
}
