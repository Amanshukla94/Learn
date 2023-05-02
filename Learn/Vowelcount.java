import java.util.Scanner;
public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBuffer S1 = new StringBuffer();
System.out.println("enter the word");
Scanner pt = new Scanner(System.in);
				String S1 = pt.next();
		
		int p;
	 char a  ;
	 char e ;
	 char i ;
	 char o ;
	 char u;
	 int count = 0;
		
		
		for (p=S1.length()-1;p>=0;p-- )
		{
			if( S1.charAt(p)=='a'){
			count++;
		}
		if( S1.charAt(p)=='e'){
		count++;
	}
	if( S1.charAt(p)=='i'){
	count++;
}
if( S1.charAt(p)=='o'){
count++;
}
if( S1.charAt(p)=='u'){
count++;
}
		
	}
	
		System.out.println(count);		
}
	
}



