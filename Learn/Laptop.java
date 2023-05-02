
public class Laptop {

	
	double ram;
	double harddisk;
	double price;
	
	Laptop(double price, double harddisk, double ram)
	{
		this.price = price;
		this.harddisk = harddisk;
		this.ram = ram;
		
	}
	public void printattributes()
	
	{
		System.out.println(ram);
		System.out.println(price);
		System.out.println(harddisk);
		}
}
