import java.util.Arrays;

public class Skucode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String array1[] = {"123@bce$45","473$ade27","35gpf286","276morfi5"};
String array2[] = new String[array1.length];
String array3[] = new String[array1.length];
String array4[] = new String[array1.length];
String regex = "[^0-9]";
String regex2 = "[0-9]";
for (int i=0;i<array1.length;i++) {
	array2[i] = array1[i].replaceAll(regex, ""); 
	array3[i] = array1[i].replaceAll(regex2, ""); 
	
} 
for (int j=0;j<array1.length;j++) {
	array4[j] = array2[j]+array3[j];
	
}
	
	System.out.println(Arrays.toString(array4));


	}

}
