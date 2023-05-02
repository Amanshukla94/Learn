
public class Loan {

	public static int Bank (int principal, int total_interest)
	{
	  
	int repaid = principal + total_interest;
	 
	 System.out.println(repaid);
	 return repaid;
	}
	public static void main(String[] args)
	{
		Bank(1000,2005);
		
		
	}
}
