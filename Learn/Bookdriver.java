import java.util.Scanner;
public class Bookdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book B1 = new Book();
		Book B2 = new Book(4, "Mossad", 5);
		Book B3 = new Book(4);
		 Book b = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title");
		b.setTitle(sc.nextLine());	
		System.out.println("Enter the price");
		b.setprice(sc.nextInt());
	     b.setBookid();
		
		
		System.out.println(" the title is"+b.getTitle());
		System.out.println("the price is"+b.getprice());
	}

}
