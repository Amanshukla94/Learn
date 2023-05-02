import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number ");
		Scanner sc= new Scanner(System.in);
		int b;
	int i =1;
		int fact =1;
		for(b=sc.nextInt();b>=i;i++)
		{
			
			
			fact = fact *i;
		}
		System.out.println("The factorial is "+fact);
	}

}
