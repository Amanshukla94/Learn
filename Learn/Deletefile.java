import java.io.File;


public class Deletefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File F= new File("bclissues.txt");
try {
if (F.delete()) {
	System.out.println("File has been deleted");
}
else{
	System.out.println("File doesn't exist anymore");
}}
catch(Exception IE) {
	System.out.println("Exception has been handled");
}
}

}
