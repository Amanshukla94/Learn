
public class Branch {
	 
	
	private String mgrname;
	private String ifsc;
	
	
	public void setmgrname(String mgrname)
	{
		this.mgrname = mgrname;
	}
	String getmgrname() 
	{return mgrname;}
	public void setifsc(String ifsc)
	{
		this.ifsc =ifsc;
	}
	String getifsc()
	{
		return ifsc;
	}
	public void Branchdetails()
	{
		
		System.out.println("The ifsc code is"+ifsc);
		System.out.println("The mgrname is"+mgrname);
		
	}
	Branch(String mgrname,String ifsc){
		this.mgrname =mgrname;
		this.ifsc =ifsc;
	}
	Account acc;
	public void createaccount(Account acc)
	{
	this.acc = acc;	
	}
	
}
