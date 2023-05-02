
public class Classcast extends Classcastparent{

	String name;
	
	Classcast(String name)
	{
		super(name);
		this.name = name;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
}
