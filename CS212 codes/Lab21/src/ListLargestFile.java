import java.io.File;
import javax.swing.*;

public class ListLargestFile {
	static File maxFile=null;
	static long maxLength=0;
	
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser("./");
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY  (directory means folders)
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f,"");
		System.out.println("Max file is:"+maxFile.getName()+" with the length of "+maxLength);

	}
	
	
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles();
	
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			System.out.print(indent+f2.getName());
			System.out.print("...");
			System.out.print(f2.lastModified());
			System.out.print("...");
			System.out.print(f2.length());
			if(f2.length() > maxLength) {
				maxLength = f2.length();
				maxFile=f2;
			}
			System.out.println();
            if (f2.isDirectory())
                listFiles(f2, indent+"   ");
		}
		
	}
}
          

