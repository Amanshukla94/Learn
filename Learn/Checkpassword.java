import java.util.Scanner;
public class Checkpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("enter the pasword");
		Scanner sc =  new Scanner(System.in);
		String password = sc.next();
		System.out.println("reenter the pasword");
		
		String confirmpassword = sc.next();
		
		if (password.equals(confirmpassword))
		
		{
		 System.out.println("Password is accepted");
		}
		else 
		{
			System.out.println("Try again");
		}
		
	}

}
