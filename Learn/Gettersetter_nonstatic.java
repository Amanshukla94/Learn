
public class Gettersetter_nonstatic {

String inkcolour;
int price;
String type;
 
 public void setattributes( String inkcolour, int price, String type)
 {
 
 
 this.inkcolour = inkcolour;
 this.price = price;
 this.type = type;
 
 }
 public void printattributes()
 
 {
	 
	 System.out.println(inkcolour);
	 System.out.println(type);
	 System.out.println(price);
 }
 
}
