import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listtoset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> LS = new ArrayList<>();
		
		LS.add(20);
		LS.add(40);
		LS.add(510);
		LS.add(632);
		
		 Set<Integer> mySet = new HashSet<>(LS);
		 
		 for (Integer x: mySet) {
			 
			 System.out.println(x);
		 }
	}

}
