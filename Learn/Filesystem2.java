import java.io.File;
import java.io.IOException;
public class Filesystem2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("BCL issues.txt");{
		if (f.createNewFile())
		{
			System.out.println("File has been created "+f.getName());
		}
		else
		{
			System.out.println("File already exist ");
		}
		}
		if (f.exists())
		{
			System.out.println("File name is "+f.getName());
		}
	}

}
