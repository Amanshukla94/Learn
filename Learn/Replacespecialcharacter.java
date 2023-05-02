//import java.util.Scanner;
public class Replacespecialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int j =0;
		
	String test[] = new String[3];
	
	test[0]= "@#man";
			test[1]= "@#shukla";
			test[2]= "shukla@#man";

 for (i=0;i<3;i++) {
		char carray[]  = test[i].toCharArray();
		
		
		for (j=0;j<test[i].length();j++) {
				// System.out.print(carray[j]);
				 
					 if (carray[j]== '@'){
						 
						 
						  carray[j]= 'a';
						// System.out.print(carray[j]); 
				 }
					 if (carray[j]== '#'){
						 
						 
						  carray[j]= 'n';
						// System.out.print(carray[j]); 
				 }
				
					 System.out.print(carray[j]); 
					
			 }
		
		 }
				 
	}}
		 
	


