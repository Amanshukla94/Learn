import java.util.Arrays;
import java.util.List;

public class Arrangepsoitivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A = {-12,-2,-27,3,1};
int[] B= new int[A.length];
int[] C= new int[A.length];

int j=0,k=0;

for (int i =0;i<A.length ;i++) {
	if (A[i]<0) {
		
		B[i]  =A[i];
		
	}else {
		C[j]  =A[i];
		j++;
	}
}
Arrays.sort(C);
Arrays.sort(B);
int fal = C.length;
int sal= B.length;
int[] resultant = new int[fal+sal];
System.arraycopy(C, 0, resultant, 0, fal);
System.arraycopy(B , 0, resultant, fal, sal);

	
/*List al = Arrays.asList(resultant);
for (k =0;k<resultant.length ;k++) {
	if (resultant[k] == 0) {
		//System.out.println(k);
		al.remove(0);*/
		
	
System.out.println(Arrays.toString(resultant));
//System.out.println((resultant.length));
	}

}
