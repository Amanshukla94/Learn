import java.io.File;
public class Filesytem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f  = new File("BCL issues.txt");
		if (f.exists())
		{
			System.out.println("filename is"+f.getName());
		}
		else
		{
			System.out.println("file not found");
		}
	}

}
