import java.util.Arrays;

public class Sortingwithforloop {

	public static void  swap (int a, int b ) {

		a=a+b;
		b=a-b;
		a=a-b;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input = {1,15,6,99,3,62};
int[] output= new int [input.length];
int j =0;
for (int i =0;i <input.length-1;i++) {

	if (input[i]>input[i+1]) {
		
		swap(input[i], input[i+1]);
	}
	else { 
		swap(input[i+1], input[i]);
	}
	
}System.out.println(Arrays.toString(input));
	}

}
