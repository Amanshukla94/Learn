
public class ExceptionPropogation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("demo begins");
		System.out.println("Demo ends");
		try {
	demo();
		}
		catch(ArithmeticException AE){
			System.out.println("Exception handled");
		}
	}
		
		 public static void demo() 
		 {
			 int a =10;
			 int b= 0;
			 int c= a/b;
			 System.out.println("Demo method begins");
			 System.out.println(c);
			 System.out.println("Demo method ends");
		 
	
		 }
}
	



