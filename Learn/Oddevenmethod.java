import java.util.Scanner;
public class Oddevenmethod {

	public static int check(int a ) {
		// TODO Auto-generated method stub
	
		if ((a%2) == 0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		return a;
	}

		public static void main(String[] args)
		{
			
			System.out.println("enter the number");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
                   check(a);
			}

	}

