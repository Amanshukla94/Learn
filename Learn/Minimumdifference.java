
import java.util.Arrays;


public class Minimumdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1[] = {20,25,52,965,534,751,2,3,9654,623};
Arrays.sort(array1);

int i =0;

int j=0, k=0;


for (i=array1.length-1;i>=0;i--)
{
	
	for(j=array1.length-2;j>=0;j--) {
		int diff[]= {array1[i]-array1[j]};
		
		Arrays.sort(diff); 
		
		for (k=0;k<diff.length;) {
		if (diff[k]>0) {
		System.out.println(diff[k]);
		//break;
		 }
		break;
		
		 }
		

	}}
	



	 
	
}}
