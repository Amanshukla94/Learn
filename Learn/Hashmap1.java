import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String, Integer> LS = new HashMap();
LS.put("Aman", 30);
LS.put("Tranny", 60);
LS.put("Trem", 50);
LS.put("Lousie", 40);

System.out.println(LS);

	//System.out.println(LS.get("Aman"));

	TreeMap <String, Integer> LP = new TreeMap<String, Integer>();
	LP.put("Aman", 30);
	LP.put("Tranny", 60);
	LP.put("Trem", 50);
	LP.put("Lousie", 40);
	System.out.println(LP);
	
	Hashtable <String, Integer> LM = new Hashtable<String, Integer>();
	LM.put("Aman", 30);
	LM.put("Tranny", 60);
	LM.put("Trem", 50);
	LM.put("Lousie", 40);
	System.out.println(LM);
	
	LinkedHashSet <Integer> LK = new LinkedHashSet<Integer>();
	LK.add(100);
	LK.add(200);
	LK.add(100);
	LK.add(300);
	LK.add(400);
	
	System.out.println(LK);
	
	
	
	
	}
	
	

}
