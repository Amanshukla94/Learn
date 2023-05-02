
import java.io.FileOutputStream;
import java.io.IOException;  
public class Filesystem4 {

	
		// TODO Auto-generated method stub
/*try {
		OutputStream OS = new FileOutputStream("BCL issues.txt");
		Writer OutputStreamWriter = new OutputStreamWriter(OS);
		OutputStreamWriter.write("My name is aman shukla");
		OutputStreamWriter.close();
		
	}
catch(IOException i)
{
	System.out.println("Exception handled");
}
}
*/
	public static void main(String[] args)  {
 try
{
	 String s ="My name is Anthony Gonsalvez";
	 FileOutputStream t=  new FileOutputStream("BCL issues.txt");
	 byte b[]=s.getBytes();
	 t.write(b);
	 t.close();
}
catch(IOException IO) {
	System.out.println("Exception handled");
}



}
}

