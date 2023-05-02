import  java.util.Scanner;
public class Timezone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the input time");
		
		Scanner SC = new Scanner (System.in);
	
				
 double Time = SC.nextInt();	
 double EST = Time +5.30;
 double IST = Time +6.30;
 double MAST = Time +7.30;
 double CARST = Time +8.30;
 double ETST = Time +9.30;
		 
	
		
 System.out.println("The system should starts in Atlantic "+EST);
 System.out.println("The system should starts in America "+IST);
 System.out.println("The system should starts in Australia "+MAST);
 System.out.println("The system should starts in Japan "+CARST);
 System.out.println("The system should starts in Germany "+ETST);
	
	}

}
