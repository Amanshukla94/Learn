
public class Superkyeword2 extends Superkeyword {

	String img = "jpeg";
	long no = 5946464;
	String video = "Test video";
	String Status = "img/video";
	
	public void sendmsg(String msg)
	{
		System.out.println(msg);
	}
	
	Superkyeword2(String img, String Status, String video, long  no){
		
		super(img, no);
		this.video = video;
this.Status = Status;

	}
	
	public void printattributes() {
	
System.out.println(img);
System.out.println(no);
System.out.println(video);
System.out.println(Status);
System.out.println(super.img);
System.out.println(super.no);
super.sendmsg("test super keyword ");


	}
	
	
}
