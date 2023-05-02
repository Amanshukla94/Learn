
public class Output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data = 175/0;
	System.out.println(data);
}
catch (NullPointerException P) {
	
	System.out.println(P);
}
finally {
	System.out.println("I am An underdog");
}
System.out.println("here is my case");}

}
