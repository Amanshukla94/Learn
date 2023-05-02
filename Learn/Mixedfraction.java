import java.util.Scanner;
public class Mixedfraction {
	static Scanner SC = new Scanner (System.in);
	
	static int x = SC.nextInt();
	static int y = SC.nextInt();
	public static int  Convert( ) throws Arithmeticexception {
	
		
		
		 System.out.println(y+"/"+x);
		 int Q = y/x;
		int P = x;
		int R = y%x;
		int res= P * Q +R ;
		System.out.println(res);
		return 0;
		
		 
		 
		 
	}
	public static void main(String[] args )
	{   
		if (Mixedfraction.x < Mixedfraction.y) {
	
		try {
			Convert();
		} catch (Arithmeticexception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled");
		}
		}
		else 
		{
		   
			System.out.println("Denomninator can not be greater than numerator ");
			System.exit(1);
		}
		
		
		}
		
	
		
	
	 

}