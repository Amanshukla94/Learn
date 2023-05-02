
public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer Name = new StringBuffer( "GanjubhaiPAtel");
StringBuffer Newname = new StringBuffer("");
 for (int i =Name.length()-1;i>=0;i--) {
	 
	 Newname.append(Name.charAt(i));
	 
 }
System.out.println(Newname);
	}

}
