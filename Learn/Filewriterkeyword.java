//import java.io.FileWriter;
import java.io.*;

public class Filewriterkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		
		FileWriter fm = new FileWriter("BCL issues.txt");
 
 fm.write("By today I will be gonna compelting File system");
 //fm.File.getCanonicalPath();
 fm.close();
 System.out.println("Successfully written");
 
 
	}
 catch(IOException I)
 {
	 System.out.println("Need to fix the exception");
	 }
 
}
}
	
