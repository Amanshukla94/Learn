
public class Pendriver2 {
 String color;
 String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pendriver2 p = new Pendriver2();
Pendriver2 p1 = new Pendriver2();
p.color = "Blue";
p.name = "fountain";
 System.out.println(p.color);
 System.out.println(p.name);
// Pendriver2 p1 = p;
 p1.color = "Blue22";
 p1.name = "fountain22";
 System.out.println(p1.color);
 System.out.println(p1.name);
 if ( p==p1)
 {
	 System.out.println("Refernce variable has same address");
 }
 else 
 {
	 System.out.println("address is different");
 
	}}

}