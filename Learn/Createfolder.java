import java.io.File;
import java.util.Scanner;
public class Createfolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name of the folder");
		String Name = sc.next();
		
		System.out.println("enter the path of the folder");
		String Path = sc.next();
		
		Path = Path + Name;
		boolean Flag;
		
		System.out.println("The name of path is"+Path);
		
		File F = new File(Path);
		boolean Flag1 = F.mkdir();
		
		if (Flag1== true) {
			System.out.println("folder has been created and path has been set");
		}
		else {
			System.out.println("Folder has not been created, please try again");
		}
	
	}

}
