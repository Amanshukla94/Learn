import java.util.Hashtable;
import java.util.TreeMap;


public class Hashtableinjava {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		TreeMap <String, Integer> HS = new TreeMap<String,Integer> ();

		HS.put("Himani", 10);
		HS.put("Surya", 20);
		HS.put("Hitesh", 30);
		HS.put("Bharni", 40);

		int age = HS.get("Himani");
		System.out.println(age);

		boolean containsKey = HS.containsKey("Bharni");
		System.out.println("Contains key 'Bharni': " + containsKey);

		boolean containsKey2 = HS.containsKey("Surya");
		System.out.println("Contains key 'Surya': " + containsKey2);

		boolean containsKey3 = HS.containsKey("Hitesh");
		System.out.println("Contains key 'Hitesh': " + containsKey3);

		HS.remove("Charlie");

		for (String key : HS.keySet()) {
		    int value = HS.get(key);
		    System.out.println("Key: " + key + ", Value: " + value);
		}for (int i =0;i!=0;i++ ) {
		System.out.println(HS.get(i));
			}}

		}
