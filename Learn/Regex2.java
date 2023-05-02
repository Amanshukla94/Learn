import java.util.Arrays;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String array1[]= {"tes$^%","*(*(","565466JB**","09*))VVH","THBH"};
String array2[]= new String[array1.length];

String regex ="[^a-zA-Z0-9]" ;
for (int i=0;i<array1.length;i++) {
	
	 array2[i]=array1[i].replaceAll(regex, "");
	
}
System.out.println(Arrays.toString(array2));
	}

}
