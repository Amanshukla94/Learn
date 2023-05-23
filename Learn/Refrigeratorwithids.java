import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Refrigeratorwithids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> Li = new ArrayList(Arrays.asList("Sony","Kelvinator","whirpool","LG","SSamsung","Daikin","Akai")) ;
		
		List <Integer> Li2 = new ArrayList(Arrays.asList(555,666,777,888,999,1000,1111,2222,3333,4444,5555));
		
		
		int sum  =0;
		for (int i=Li.size();i<Li2.size();i++ )
		
		{
			
		     sum  = sum + Li2.get(i);
		     sum++;
			
		}System.out.println(sum);
			
			
			
			
			
			 
			
	}

}
