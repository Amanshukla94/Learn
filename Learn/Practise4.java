import java.util.Scanner;
public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a =  sc.nextInt();
		System.out.println("enter the second number");// Arthimetic exception
		
		int b = sc.nextInt();
		try {
		int c = a/b;}
		catch(ArithmeticException AE){
			System.out.println("Denominator can not be zero");
		}
		//System.out.println(c);
	}

}
