
public class Construct2 {
	
	int id;
	String name;
	String classname;
 
	Construct2(){
	this.id  = id ;
	this.name = name;
	this.classname = classname;
	
	System.out.println(id + name+classname);
	System.out.println("No parameter ");
}
	Construct2(int id){
		this.id  = id ;
		this.name = name;
		this.classname = classname;
		System.out.println("one parameter ");
		System.out.println(id + name+classname);
}
	Construct2(int id, String classname){
		this.id  = id ;
		this.name = name;
		this.classname = classname;
		
		System.out.println("two parameters");
		System.out.println(id + name+classname);
		
	}}
