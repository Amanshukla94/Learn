public class Exceptionpropogation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("demo begins");
	demo();
		System.out.println("Demo ends");}
		 public static void demo() 
		 {
			 int a =10;
			 int b= 0;
			 try {
				 
			 int c= a/b;
			 System.out.println(c);
			 }
			 catch(ArithmeticException AE) {
				 System.out.println("Do no enter zero as denominator");
			 }
			 System.out.println("Demo method begins");
			
			 System.out.println("Demo method ends");
		 
	
		 }
}
	



