
public class Nonstaticmember {

	public void test() {
	
		System.out.println("My name is aman shukla");
		// TODO Auto-generated method stub

	}
	public static void demo() {
		System.out.println("I am an engineer");
	}
	
	public static void main(String[] args) {
		Nonstaticmember N2 = new Nonstaticmember();
		N2.demo();
		
		
		Nonstaticmember N1 = new Nonstaticmember();
		N1.test();
		
	}
	
}
