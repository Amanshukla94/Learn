
public class Account {

	private long accno;
	private String accname;
	private double bal;
	
	public void setaccno(long accno)
	{
		this.accno =accno;
	}
	 long getaccno()
	 {
		
		 return accno;
		 
	 }
	 public void setaccname(String accname)
		{
			this.accname =accname;
		}
		 String getaccname()
		 {
			
			 return accname;
		 }
		 
		 public void setbal(double bal)
			{
				this.bal =bal;
			}
			 
		Account(String accname, double bal, long accno)
		{
			this.accname =accname;
			this.bal =bal;
			this.accno=accno;
		}
		public void Accountdetails()
		{
			System.out.println("The account number is"+accno);
			System.out.println("The account name is "+accname);
			System.out.println("The balance is "+bal);
			
		}
}
