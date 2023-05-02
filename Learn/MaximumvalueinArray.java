import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaximumvalueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0,m=0;
ArrayList <Integer> numbers  = new ArrayList<>(Arrays.asList (787,252,407,901,352,886,674,021,110,117,365));
int num2[] = new int[numbers.size()];
int num3[] = new int[numbers.size()];
numbers.sort(Comparator.naturalOrder());

for(int i=numbers.size()-1;i>(numbers.size()/2);i--) {
	
	num2[j]=numbers.get(i);
	j++;
	
	 
}for(int  i=numbers.size()/2;i>=0;i--) {
	
	num3[m]=numbers.get(i);
	
	//System.out.println(num3[m]);
	
	m++;
}
int fal = num2.length;
int sal =num3.length;
int resultant[] = new int[fal + sal];
System.arraycopy(num2, 0, resultant, 0, sal);
System.arraycopy(num3, 0, resultant, sal, fal);

for(int k=0;k<resultant.length;k++) {
	if (resultant[k]!= 0) {
	System.out.println(resultant[k]);
	}
	 
}
	}

}
