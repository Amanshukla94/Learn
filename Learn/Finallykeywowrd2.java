import java.util.Scanner;
public class Finallykeywowrd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");
int a = sc.nextInt();
System.out.println("enter the second number");
int b= sc.nextInt();
 try {
	int  c =a/b;
	System.out.println(c);
 }
 catch(NullPointerException AE)
 {
	 System.out.println("Zero can not be used as Denominator");
 }
 finally {
	 System.out.println("Used in case if their is no exception to continue the flow");
 }
	}

}
