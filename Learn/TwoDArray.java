import java.util.Scanner;
public class TwoDArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j = 0;
	
		Scanner SC = new Scanner(System.in);	
 System.out.println("Enter the size of the row");
	int size = SC.nextInt();
	 System.out.println("Enter the size1 of the column");
	int size1 = SC.nextInt();
	int test [][] = new int[size][size1];
	
	
	try {
	System.out.println("Enter the array elements");
	for (i=0;i<size;i++);
	{
	
		 
		for (j=0;j<size1;j++);
		{
		
		 test[i][j]= SC.nextInt();
		 }
	}
	
	
	System.out.println("The array elements are ");
for (i=0;i<size;i++);
	
	{
		
		for (j=0;j<size1;j++);
		{
		 System.out.println(test[i][j]+"");
		}
		 System.out.println();
	}}
	catch(ArrayIndexOutOfBoundsException AE)
	{
		System.out.println("Exception handled");
	}
	}
	}
 
 
