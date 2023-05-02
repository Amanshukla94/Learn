
public class Practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String ch = "Hellow";
 try
 {
 char Test = ch.charAt(70);// String out  of bound exception - character
 }
 catch( StringIndexOutOfBoundsException SE)
 {
	 System.out.println("Print the character within the limit");
 }
 System.out.println(ch);
		
	}

}
