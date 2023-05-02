
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arra = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};

for (int i = 0;i<arra.length-2;i++ )
{
	
	
	if (arra[i+2]== arra[i]+arra[i+1]) {
		//System.out.println("This is fibonacci series");
		continue;
	}
	
	else {System.out.println("This is not fibonacci series");
		
	}
}
if (arra[arra.length-1]== arra[arra.length-2]+arra[arra.length-3]) {
	System.out.println("This is fibonacci series");
}

	}

}
