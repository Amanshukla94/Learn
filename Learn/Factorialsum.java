import java.util.Scanner;
public class Factorialsum {

	
	public static void main(String[] args) {
	int b;
	int a;
	int i;
	int sum = 0;
	int fact = 1;
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	
	{
	
	for (b=sc.nextInt();b>0;b=b/10)
	{
	 a =b%10;
	 for(i=1;i<a;i++)//5
			 {
		  fact = fact*(i);
		
		
	 } 
	}sum = sum +fact;
	
}System.out.println(sum);

}}