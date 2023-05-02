import java.util.Scanner;
public class lastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		

		int res = num%10;
		System.out.println(res);
	}

}
