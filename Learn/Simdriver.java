import java.util.Scanner;
public class Simdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sim  B1 = new Sim();
		Sim  B2 = new Sim(5454544, "Mossad", "False");
		Sim B3 = new Sim(4);
		 Sim b = new Sim();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		b.setname(sc.nextLine());	
		System.out.println("Enter the status");
		b.setstatus(sc.nextLine());
	     b.setphone();
		
		
		System.out.println(" the status is"+b.getstatus());
		System.out.println("the name is"+b.getname());
	}

}
