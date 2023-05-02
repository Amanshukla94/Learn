
public class SKUID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array1[] = {"478$2","875@1","017||3","2456$|$$","3745@2!"};
		int m = 0;
		
	char  test[] = new char[1000];
	 char num [] = {'$','|','!','@'};
	 
	 for(int i = 0;i<array1.length;i++) {
		 
	 for(int j = 0;j<array1[i].length();j++) {
		 char chararray1[] = array1[i].toCharArray();
		 
		 if(chararray1[j]== '!'||chararray1[j]=='$'||chararray1[j]=='|'||chararray1[j]=='@'){
			continue;
			
			
		 }
		 else {
			 test[m] = chararray1[j];
			 System.out.println(test[m] );
			 m++;
			 
		 }
		
	 }} }}
	 
	


