
public class Book {

	private int Bookid;
	private String Title;
	private int price;
	
	public void setBookid()
	{
		
		System.out.println("nothing to print");	
	}
	public void setTitle(String Title)
	{
		this.Title = Title;
			
	}
	public void setprice(int price)
	{
		this.price = price;
		
	}
	public String getTitle() {
		return Title;
	}
	public int getprice() {
		return price;
	}
	Book()
	 {
		 System.out.println("nothing to print");
	 }
	 
	 Book(int Bookid)
	 {
		 this.Bookid = Bookid;
		 System.out.println("Bookid is"+Bookid);
	 }
	 Book(int Bookid, String Title, int price)
	 {
		 this.Bookid = Bookid;
		 this.Title = Title;
		 this.price = price;
		 System.out.println("Bookid, Title and Price are respectively"+Bookid+price+Title);
	 }

	
	}
