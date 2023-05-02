
public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = new String("Java");
		String S2 = new String("Java");
		
		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
		System.out.println(S1.hashCode()==S2.hashCode());
	}

}
