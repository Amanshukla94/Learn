
public class Reversestring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer S1 = new StringBuffer("MynameisAmanShukla");
StringBuffer  S2 = new StringBuffer("");
int i;

for (i=S1.length()-1 ;i>=0;i--)
{
	S2= S2.append(S1.charAt(i));
	
	}
System.out.println(S2);
			
			
	}

	}

