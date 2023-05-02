import java.util.Scanner;
public class Largestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("enter the value of c");
		int c = sc.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("a is the largest number");
		}
		if (b>c && b>a)
		{
			System.out.println("b is the largest number");
		}
		if (c>a && c>b)
		{
			System.out.println("c is the largest number");
		}
		

	}

}
