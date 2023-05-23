import java.util.Arrays;

public class Productcodeandproductname {

	public static void main(String[] args) {
		int k =0;
		int j =0;
		int i =0;
		// TODO Auto-generated method stub
String[] productname = {"Table", "chair","spoon", "cabinet", "comb","tea","net","towel", "peg","bottle","afeem", "cigar","perfume","latex","jellybean"};
		
String[] Alphabet  = {"I","O","C","A","3"};

String[] Outputarray= new String[productname.length];

for ( i = 0;i<Alphabet.length;i++)
{
	Outputarray[k] =productname[j]+Alphabet[i];
	j++;
	k++;
 
	 
 }

	 for ( i= 0;i<Alphabet.length;i++) {
		 Outputarray[k] =productname[j]+Alphabet[i];
		 System.out.println(Outputarray[k]);
		 k++;
		 j++;
	 }
	
	 for (k= 0;k<Outputarray.length;k++) {
		 System.out.println(Outputarray[k]);
		 if (Outputarray[k]=="null") {
			 break;
		 }
	 }
}
}


