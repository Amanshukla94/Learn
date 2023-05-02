
public class Classcastdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classcast c1 = new Classcast("Maggie");
		Classcastparent cp1 = new Classcastparent("Noodles");
		cp1= c1;
		
		c1.display();
		cp1.display();
		Classcastparent  c2 = new Classcastparent("manga");
		Classcast cp2 = (Classcast)c2;
	}

} 
