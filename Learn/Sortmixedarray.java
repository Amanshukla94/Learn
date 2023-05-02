import java.util.Arrays;

public class Sortmixedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 0, j= 0, k= 0;
int mixedarray[] = {-12,-25,36,555,1,-25,36,-26,337,-96,390};
int newarray[]  = new int[mixedarray.length];
int newarray2[]  = new int[mixedarray.length];
Arrays.sort(mixedarray);
//System.out.println(mixedarray);
for (i= 0;i<mixedarray.length;i++) {
	if (mixedarray[i] > 0) {
		newarray[j] = mixedarray[i];
				j++;
				
	}
	if (mixedarray[i] < 0) {
		newarray2[k] = mixedarray[i];
				k++;
				
	}
	
	
}
Arrays.sort(newarray);
Arrays.sort(newarray2);
int fal = newarray.length;
int sal = newarray2.length;
int[] res  = new int[fal+sal];
System.arraycopy(newarray, 0, res, 0, fal);
System.arraycopy(newarray2, 0, res, fal, sal);
for (i= 0;i<res.length ;i++) {
	if (res[i] != 0) {
System.out.println(res[i]);
	}
}
}
}
