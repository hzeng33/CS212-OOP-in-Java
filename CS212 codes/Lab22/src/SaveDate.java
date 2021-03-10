
/**
 * First run SaveDate.java, it will save in "data.out".
 * Then run the ReadDate.java.
 */

import java.io.*;
import java.util.Date;  //Date class is a build-in class.

public class SaveDate {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("date.out"); 
    ObjectOutputStream oos = new ObjectOutputStream(fos); //create an object
    Date date = new Date();
    oos.writeObject(date);
    oos.flush();
    oos.close();
    fos.close();
  }
}
