import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distinctvalueinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0 ;
  int test []= {1,11,12,112,1221};
  int employeecode []= {21,11,12,112,62};
  int fal = test.length;
  int sal = employeecode.length;

 int resultant[] = new int [fal + sal];
 
  System.arraycopy(test,0,resultant,0, fal);
  System.arraycopy(employeecode,0,resultant,fal, sal);
  //System.out.println(Arrays.toString(resultant));
  Arrays.sort(resultant);
  int j = 0;
		  
  int arr[] = new int[resultant .length];
  
  for (int i=0; i<resultant.length-1;i++)
  {
	  if (resultant[i]!=resultant[i+1])
	  {
		arr[j]=  resultant[i];
		j++;
	  }
	  
	  
  }
  //System.out.println(j); 
  arr[j]=resultant[resultant.length-1];
  
		for (j=0;j<arr.length;j++) {
  System.out.println(arr[j]); 
	}
	}
		
			 

	  }
	  
  
  
  
	


