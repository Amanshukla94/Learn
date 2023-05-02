import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;
public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner SC = new Scanner(System.in);
 System.out.println("Enter the number ");
  int num = SC.nextInt();
  
 ArrayList <Integer> ls = new ArrayList<Integer> ();
   for (int i=0;i<num;i++) {
	   ls.add(SC.nextInt());
	   
   }
   System.out.println("Enter the selection");
		int selection = SC.nextInt(); 
		
		  if (ls.contains(selection)) {
			  System.out.println("The index number of 100 is"+ls.indexOf(selection));
		  }
		  else {
			  System.out.println("Element not found");
		  }
	}

}
