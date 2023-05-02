import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the first number");
 Scanner sc = new Scanner(System.in);
 int  num = sc.nextInt();
   
  if(( (num % 4)==0) && ((num%100)!=0) || ((num % 400) == 0))
  
  {
	  System.out.println("It is a leap year");  
  }

  else 
  {
	  System.out.println("It is not a leap year");  
  }
	}

}
