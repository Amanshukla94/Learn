public class Reversesubstringwithstring
{
	
	public static void main(String[] args)
	{
		String given = "I would love to watch Netflix"; 
		StringBuffer S1= new StringBuffer("");
		
		System.out.println("Input is : "+given);
		
		for (int k  =given.length()-1; k >=0;k--)
		{
			
			if (Character.isWhitespace(given.charAt(k))) {
				
				continue;
			}
			else {
				S1.append(given.charAt(k));
			}
			
		}
		//StringBuffer S2 = S1;
		for (int j  = 0; j <given.length();j++)
		{
			
			if (Character.isWhitespace(given.charAt(j))) {
				S1.insert(j,'\s');
				continue;
			}
			/*else {
				S2.append(given.charAt(j));
			}
			*/
		}
		System.out.println("Output is :"+S1);
	
	
	}


}