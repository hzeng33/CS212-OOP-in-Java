import java.io.File;
import javax.swing.*;
public class ListFiles {

/**
 * By default, it will start in the default directory, which is My Documents in Windows.
        JFileChooser fd = new JFileChooser();

If you want it to start in another directory, you need to pass in the directory's path.
        JFileChooser fd = new JFileChooser("C:/Users/Franklin/Desktop"); //note the forward slashes
        // or
        JFileChooser fd = new JFileChooser("C:\\Users\\Franklin\\Desktop"); //will not work if you don't have TWO backslashes.

To start in the directory of the program, use dot slash ("this folder")
        JFileChooser fd = new JFileChooser("./");
 * @param args
 */
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY  (directory means folders)
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f,"");

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
			
			System.out.println();
            if (f2.isDirectory())
                listFiles(f2, indent+"   ");
		}
		
		
	}
}