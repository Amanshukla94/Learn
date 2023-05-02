import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1[] = {1,2,3,4,5,6,8,5,4,5,5,5,5,5,5};

for (int num : array1) {
	//System.out.println(num);
	
} List  <Integer>  Ls1 = new ArrayList <>();


Ls1.add(1);
Ls1.add(2);
Ls1.add(3);
Ls1.add(4);
Ls1.add(4);

//int array2[] = new int[Ls1.size()];
Object[] array2 = Ls1.toArray();
System.out.println(Arrays.toString(array2));
for (Object num : array2) {
	
System.out.println(num +"/^^^^^^^^^^/");
}

	}

}
