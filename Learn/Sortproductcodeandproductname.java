import java.util.Arrays;

public class Sortproductcodeandproductname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0;
String productname  [] = {"37","37","65","65","65","25","32"};
String productcode [] = {"A","B","C","D","E","F","G"};
String resultant[] = new String[productname.length];
for (int i =0;i<productname.length;i++) {
	resultant[j]= productname[i] +  productcode[i];
	j++;
}
	
	Arrays.sort(resultant);
	System.out.println(Arrays.toString(resultant));
	
}
}