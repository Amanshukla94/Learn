import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {10,20,30};
		ArrayList <Integer> LS = new ArrayList<Integer> ();
		LS.add(40);
		LS.add(50);
		LS.add(60);
		LS.add(70);
		
	System.out.println(LS);
	
	List<Integer> L = new ArrayList <Integer>();
	L.add(90);
	L.add(110);
	L.add(120);
	
	
	
	L.addAll(LS);
	System.out.println(LS.size());
	System.out.println(L);
	}

}
