import java.util.Scanner;
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter a and b");
int a = sc.nextInt(), b=sc.nextInt();
try {
int c = a/b;

System.out.println(c);}

catch(Exception E) {
	
	System.out.println("Exception handled");
}
finally {
	System.out.println("finally block executed");
}
	}

}
