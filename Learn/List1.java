import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List  <Integer> LS = new ArrayList();

LS.add(500);
LS.add(600);
LS.add(700);
LS.add(800);

//System.out.println(LS);

List <Integer> LP = new ArrayList(Arrays.asList(22,22,52,6,555,662,22,551,5));
//System.out.println(LP);
if (LS.size() >LP.size()) {
	for (int i =LS.size()-1;i>LP.size();i--) {
		//System.out.println(LS.get(i));
	}
}else {for (int i =LP.size()-1;i>LS.size();i--) {
	//System.out.println(LP.get(i));
}

Object PL[] =LP.toArray(); 
//System.out.println(Arrays.toString(PL));
	
}
	
	//Set <Integer>  LM = new LinkedHashSet <Integer>(LP);
	//System.out.println(LM);
	
	
	}

}
