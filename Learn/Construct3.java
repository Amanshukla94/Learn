
public class Construct3 {

	
	int id;
 String name;
 double price;
 String description;
 
 Construct3(int id, double price)
 {
	 this.id =id;
	 this.price=price;
	
	System.out.println("Two parameters has been initialised");
 }
 Construct3(String description, String name)
 {
    this.name =name;
	this.description = description;
	System.out.println("Another Two parameters has been initialised"+description+name);
 }
Construct3(int id, String name,String description, double price)
{
	 this.id =id;
	 this.name =name;
	 this.price=price;
	this.description = description;
	System.out.println("All parameters has been initialised"+id+description+price+name);
}


}
