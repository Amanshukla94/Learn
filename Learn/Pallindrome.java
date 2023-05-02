
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "464646464";
		String S2 = "";
	
	for (int i=S1.length()-1;i>=0;i--)
	{
		 char S3=(S1.charAt(i));
		 S2= S2+S3;
	}
	
	System.out.println(S2);
	int k=Integer.parseInt(S1);  
	int L=Integer.parseInt(S2); 
	if (k==L) {
		System.out.println("The number is pallindrome");
	}
	else {
		System.out.println("The number is Not pallindrome");
		
	}
	
	}
}


