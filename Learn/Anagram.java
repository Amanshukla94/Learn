import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
	
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		String a = SC.nextLine();
		String b = SC.nextLine();
		 char c[]= a.toCharArray();
		 char d[] = b.toCharArray();
		 Arrays.sort(c);
		 Arrays.sort(d);
		 System.out.println(Arrays.toString(c));
		 System.out.println(Arrays.toString(d));
		 if (Arrays.equals(c, d)) {
			 System.out.println("string is anagram");
		 }
		 else {
			 System.out.println("string is not anagram");
		 }
		
		
	}
	
	
}