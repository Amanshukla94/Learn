import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
try (FileReader FD = new FileReader("BCL issues.txt")) {
	int i;
	for (i=FD.read();(i= FD.read())!=-1;i--);
			{
				System.out.println((char)i);
			}
			FD.close();
}
		}
	catch(IOException I)
	{
		System.out.println("print");
	}

}
}
