import java.util.Scanner;
public class Digitsum {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("Enter the digit");

	Scanner sc = new Scanner(System.in);
	 int i;
	
	

	 int sum =0;
	
	   for (i=sc.nextInt();i!=0;i=i/10)
	   {
		   
		    sum = sum + i%10;
		  
	   }
	   System.out.println("The digit count is"+sum);
		}

	}
