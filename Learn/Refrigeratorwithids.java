import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Refrigeratorwithids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> Li = new ArrayList<String> ();
		Li.add("Sony");
		Li.add("Kelvinator");
		Li.add("whirpool");
		Li.add("LG");
		Li.add("Samsung");
		Li.add("Daikin");
		Li.add("Akai");
		
		List <Integer> Li2 = new ArrayList<Integer> ();
		Li2.add(555);
		Li2.add(666);
		Li2.add(777);
		Li2.add(888);
		Li2.add(999);
		Li2.add(1000);
		Li2.add(1111);
		Li2.add(2222);
		Li2.add(3333);
		Li2.add(4444);
		Li2.add(5555); 
		
		int sum  =0;
		for (int i=Li.size();i<Li2.size();i++ )
		
		{
			
		     sum  = sum + Li2.get(i);
		     sum++;
			
		}System.out.println(sum);
			
			
			
			
			
			 
			
	}

}
