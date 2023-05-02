import java.util.ArrayList;
import java.util.List;

public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List <Integer> Ls = new ArrayList();

		 Ls.add(1);
		 Ls.add(2);
		 Ls.add(3);

		 List  <Integer>  Ls1 = new ArrayList();


		 Ls1.add(1);
		 Ls1.add(2);
		 Ls1.add(3);
		 Ls1.add(4);
		 
		int test;

		
if (Ls.size()>Ls1.size()){
	test=Ls.size()-Ls1.size();
	 for (int j=Ls.size();j>Ls.size()-test;j--){
		 System.out.println(Ls.size());
		 break;
	 }
}else {
	
	test=Ls1.size()-Ls.size();
	 for (int j=Ls1.size();j>Ls1.size()-test;j--){
		 System.out.println(Ls1.size());
		 break;
	 }
}

		 }
	}


