
public class Superkeyword {

	
	String img  = "png";
	long no = 5545455;
	//String msg;
	
	public void sendmsg(String msg)
	{
		System.out.println(msg);
	}
	
 Superkeyword()
		 {
			System.out.println("No arguement contructor ") ;
		 }
 Superkeyword(String img, long no)
 {
	 this.img  = img;
			 this.no =no;
			 
			 System.out.println(img);
		System.out.println(no);
 }
}

