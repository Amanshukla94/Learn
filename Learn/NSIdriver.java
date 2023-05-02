import java.util.Scanner;
public class NSIdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter the details");
 Scanner sc = new Scanner(System.in);
 NSI n = new NSI();
 
 n.gender = sc.next();
 n.weight = sc.nextInt();
		
 System.out.println(n.gender);
 System.out.println(n.weight);
 
	}

}
