import java.util.Scanner;
public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the digit");

Scanner sc = new Scanner(System.in);
 int b = sc.nextInt();
 int count=0;
   for (b++; b!=0 ;count++)
   {
	   b=b/10;
	  
   }
   System.out.println("The digit count is"+count);
	}

}
