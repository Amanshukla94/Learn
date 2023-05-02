import java.util.Scanner;
public class Productsdigit {

	
	
	public static void Products( ) {
		System.out.println("Enter the number");
		Scanner SC = new Scanner(System.in);
		int X= SC.nextInt();
		int mul=1, count=0 ;
		for (int y=1;X>0;X=X/10) {
			y=X%10;
			mul=mul*y;
			count ++;
			System.out.println(mul);
			
			//System.out.println(count);
		}
		
		System.out.println(count);
	
	}
		
		
		
		
		
		
	public static void  main(String[] args) {
		Products();
		
	}
}