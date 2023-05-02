
public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a  =25;
 int b= 0;
 
 
 try {
	 int c = a/b;
	 System.out.println(c);
 }
 catch (ArithmeticException AE)
 {
	 System.out.println("Do not use zero as denominator ");
 }
 finally
 {
	 System.out.println("It is used in case exception arises");
 }
	}

}
