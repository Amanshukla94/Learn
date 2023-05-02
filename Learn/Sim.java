
public class Sim {

	private int phone;
	private String name;
	private String status ;
	
	public void setphone()
	{
		
		System.out.println("nothing to print");	
	}
	public void setname(String name)
	{
		this.name = name;
			
	}
	public void setstatus(String status)
	{
		this.status = status;
	if (status.equals("active")) {
		System.out.println("use");
	} 
	else {
		System.out.println("simcard not in use");
	}
	}
	public String getstatus() {
		return status;
	}
	public String getname() {
		return name;
	}
	Sim()
	 {
		 System.out.println("nothing to print");
	 }
	 
	Sim(int phone)
	 {
		 this.phone = phone;
		 System.out.println("phone  is"+phone);
	 }
	 Sim(int phone, String status, String name)
	 {
		 this.name = name;
		 this.phone = phone;
		 this.status = status;
		 System.out.println("Bookid, Title and Price are respectively"+phone+name+status);
	 }

	
	}

