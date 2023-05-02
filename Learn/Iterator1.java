import java.util.*;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> as = new ArrayList<Integer>();

as.add(2);
as.add(4);
as.add(6);
as.add(8);

Iterator<Integer> i = as.iterator();
while (i.hasNext());
{
	System.out.println(i.next());
	}
	}

}
