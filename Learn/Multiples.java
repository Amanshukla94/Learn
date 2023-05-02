import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=  new Scanner(System.in);
		int d = sc.nextInt();
		int i,f ;
		for (i=1;i<10;i++)
		{
			f = (d *i);
			System.out.println(f);
		}

	}

}
