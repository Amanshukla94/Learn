
public class Objectclass {

	String colour;
	String model;
	double price;
	
	Objectclass(String colour, String model, double price)
	{
		this.colour = colour;
		this.model = model;
		this.price = price;
	}
	
	public String toString ()
	{
		return colour + model+ price;
	}
}
