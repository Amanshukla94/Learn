import java.util.Arrays;

public class Outputsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=0;
String B[] =  new String[k];

		String A[]= {"a5", "a2", "a1", "a6", "a3 ", "a4"};
		
		Arrays.sort(A);
		for (int i=0;i<A.length;i++)
		{
			//System.out.println(A[i]);
			for (int j=0;j<A[i].length();j++) {
				//System.out.println(A[i]);
			char a =A[i].charAt(j);
			//System.out.println(a);
			if (a%2==0)
			{
				 B[k]=A[i];
				 k++;
				 System.out.println(B[k]);
			}
		
			}
			
		}
		
		
	}

}
