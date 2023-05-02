import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=  new Scanner(System.in);
		int d = sc.nextInt();
		int i;
		int count = 0;
		 for (i=1;i<=d;i++)
		 {
			 if (d%i==0)
			 {
					 System.out.println(i);
					 count++;
					 
			 }
		 }
		 System.out.println(count);

	}

}
