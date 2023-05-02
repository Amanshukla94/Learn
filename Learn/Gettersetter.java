
public class Gettersetter {

	static long mob ;
	    static String add;
	    static String name;
	    static long regno ; 
		
	
	public static void setmob(long mob)
	{
		Gettersetter.mob = mob;
		System.out.println("the mobileno has been saved in the backend");
		}
	
	static void setadd(String add)
	{
	Gettersetter.add = add;
	System.out.println("the address has been saved in the backend");
	}
	static void setname(String name)
	{
		Gettersetter.name = name;
	System.out.println("the name has been saved in the backend");}
	static void setregno(long regno)
	{
		Gettersetter.regno = regno;
	System.out.println("the regno has been saved in the backend");
	}
	
	static String getadd()
	{
	return add;
	}
	static String getname()
	{
	return name;
	}
	
	static long getregno()
	{
	return regno;
	}
	
	static long getmob()
	{
	return mob;
	}
	
		
}

