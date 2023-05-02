import java.util.ArrayList;
import java.util.List;

public class Arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> ls = new ArrayList<Integer> ();
		
		ls.add(5);
		ls.add(25);
		ls.add(335);
		ls.add(2525);
		ls.add(305);
		
		System.out.println(ls);
		
ArrayList <Integer> arr = new ArrayList<Integer> ();
		
		arr.add(52);
		arr.add(35);
		arr.add(54);
		arr.add(56);
		arr.add(58);

		System.out.println(arr);
		
		ls.addAll(arr);
		
System.out.println(ls);
		
	}

}
