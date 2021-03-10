
import java.io.*;
import java.util.Date;

public class ReadMoney {
	 public static void main(String argv[]) throws Exception {
		    FileInputStream fis = new FileInputStream("money.out");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    Quarter q = (Quarter) ois.readObject(); //cast to Date type, and read it.
		    System.out.println("Quarter is: "+q);
		    ois.close();
		    fis.close();
		  }

}
