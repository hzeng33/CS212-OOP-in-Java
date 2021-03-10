
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.Date;

public class SaveMoney {
	public static void main(String argv[]) throws Exception {
	    FileOutputStream fos = new FileOutputStream("money.out"); 
	    ObjectOutputStream oos = new ObjectOutputStream(fos); //create an object
	   
	    Quarter q = new Quarter();
	    oos.writeObject(q);
	    oos.flush();
	    oos.close();
	    fos.close();

   }
	
}
