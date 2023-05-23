import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Familyprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] family = {"Treskey","Lemme","Starcoff","Anes","Gothalem","Greeks","Morshell"};
String[] Guest = {"Mall","Tom","Crele","Ladon","Stephen","Anna","Bob","Malick","Aley","Grade","Leena","Bruce","Tonado","Kimmy"
		,"Bilin","Hamley","Julie","Wona","Reynolds"};
String[] output = new String[Guest.length];
int k =0;
int m=0;

for (int i =0;i<family.length;i++) {
	for (int j =0;j<Guest.length;j++) {
	
		
	if (family[i].charAt(m)== Guest[j].charAt(m) ) {
		
		output[k]= Guest[j];
k++;
		
		
	}
	}
}
List <String>  ls = Arrays.asList("Stephen","Bruce","Aley");
List <String>  lp = Arrays.asList(output);
List <String> lm = new ArrayList<>();
lm.addAll(lp);
lm.removeAll(ls);
for (int num=0;num<output.length-2;num++) {
	
	
	if (output[num]!=null) {
System.out.println(lm.get(num));}}
}

}
