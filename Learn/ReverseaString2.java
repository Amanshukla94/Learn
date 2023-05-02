import java.util.Arrays;

public class ReverseaString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "AmanShukla";
		String sum = "";
	char array1[] = new char[A.length()];
	int j =0;
	
	for (int i =A.length()-1;i>=0;i--) {
		
	array1[j]=	A.charAt(i);
	j++;
	
	}for ( j=array1.length-1;j>=0;j--) {
		sum = array1[j]+sum;
		
	}
	System.out.println(sum);

	}

}
