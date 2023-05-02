
public class Inheritancedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance101 I = new Inheritance101();
		I.a = 200;
		I.b = 2000;
		I.demo();
		I.demo2();
		System.out.println(I.a);
		System.out.println(I.b);
		// Child class can acquire the property of child class as well as Parent class
		  // but parent class can acquire only parent class property.
		
		
		/*Inheritance1 A = new Inheritance1();
		A.a = 50;
		A.b =520;
		A.demo();
		A.demo2();*/
	}

}
