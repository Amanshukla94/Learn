import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Samelistproductmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List <Character> ls =new ArrayList<Character>();
List <Character> ls2 =new ArrayList<Character>();

int count =0;
	
	ls.add('A');	
	ls.add('B');	
	ls.add('C');	
	ls.add('D');	
	ls.add('E');	
	ls.add('F');	
	ls2.add('A');
	ls2.add('F');
	ls2.add('E');
	ls2.add('C');
	ls2.add('H');
	ls2.add('G');
	
	for (int i =0;i<ls.size();i++) {
		if (ls.contains(ls2.get(i))) {
			count++;
			if (ls.get(i)>ls2.get(i)) {
				
				ls2.remove(i);
			}
			else {
				ls.remove(i);
				
			}
			
			
		}
		
	}System.out.println(ls);
	System.out.println(ls2);
	System.out.println(count);

		}
		
	}


