import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Iterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner SC = new Scanner(System.in);
	System.out.println("enter the number of fruits that need to be entered");
	int fruitsnumber = SC.nextInt();
	
	System.out.println("enter the fruits name ");
	ArrayList <String>AL = new ArrayList<String>();
	for (int i=1;i<=fruitsnumber;i++)
	{
		AL.add(SC.nextLine());
	}
	
	System.out.println("==========================");
	Iterator I =AL. iterator ();
	while (I.hasNext() ) {
		String STR = (String)I.next();
		System.out.println(STR+STR.length());
	}
	}

}
