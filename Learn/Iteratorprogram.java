import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> AL = new ArrayList<Integer>();
		
		AL.add(10);
		//AL.add(20);
		AL.add(30);
		AL.add(40);
		
		Iterator i  =   AL.iterator();
	if (i.hasNext()) {
		System.out.println(i.next());
	}
	}

}
