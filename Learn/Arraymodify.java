import java.util.Arrays;
import java.util.Scanner;

public class Arraymodify{
	public static void main(String[] args) {
		
		// Size of array decided by User
		
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the first number ");
		int firstcount = SC.nextInt();
		System.out.println("enter the second number ");
		int l =0;
		int secondcount = SC.nextInt();
		int array1[] = new int[firstcount];
		int array2[] = new int[secondcount];
		System.out.println("enter the numbers in first array ");
		
		//elements through user input
		
		for (int i =0;i<firstcount;i++)
		{
			
			array1[i]= SC.nextInt();
		}
		System.out.println("enter the numbers in second array ");
		for (int j =0;j<secondcount;j++)
		{
			array2[j]=SC.nextInt();
			
		}
		int resultant[] = new int[firstcount + secondcount]; 
		System.arraycopy(array1, 0, resultant,0, firstcount);
		System.arraycopy(array2, 0, resultant,firstcount,secondcount);
		
		System.out.println(Arrays.toString(resultant));
		Arrays.sort(resultant);
		int new_x[] = new int[firstcount-1];
		int new_y[] = new int[firstcount+1];
		for (int k=0;k<resultant.length;k++) {
			if (k<firstcount-1) {
			new_x[k]= resultant[k];}
			else {
				
				new_y[l] =resultant[k];
				l++;
			}
		}	System.out.println(Arrays.toString(new_x));
		System.out.println(Arrays.toString(new_y));
		}
	
		
	


}








