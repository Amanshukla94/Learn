package locators;

public class ReverseDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
String S1 = new String ("I am in London");
char carray[] = S1.toCharArray();  
 int count = 0;
 int repeat =0;
for (int i=S1.length()-1; i>=0;i--) {
	S1.charAt(i);
	count ++;
	
	
}System.out.println(count++);


for (int i=0;i<S1.length();i++)
{
	for (int j=i+1;j<S1.length();j++) {
		if(carray[i]  ==  carray [j]&& carray[i] != ' ');{
			
			repeat++;
			carray[j]='0';
			
		}
		
	}
	
	if(repeat > 1 && carray[i] != '0')  
        System.out.println(carray[i]);  
}



	}
}
