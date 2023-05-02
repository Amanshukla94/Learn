
public class Pendriver3 {

	public static void main(String[] args) {
	Pen P1  = new Pen("blue",2000);
	Pen P2 = new Pen("blue",2000);
	
	System.out.println(P1);
	System.out.println(P2);
	System.out.println(P1==P2);
	System.out.println(P1.hashCode());
	System.out.println(P2.hashCode());
	System.out.println(P1.equals(P2));

	
	
}
}
