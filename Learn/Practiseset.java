	import java.util.Scanner;
public class Practiseset {




	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        String b = sc.next();
	        int count = 0, count1 = 0;
	        for (int k = 0; k < a.length(); k++) {
	            char[] c = a.toCharArray();
	            char[] d = b.toCharArray();
	            for (int i = 0; i < a.length(); i++) {
	                for (int j = 1; j < a.length(); j++) {
	                    if (c[i] == c[j]) {
	                        count++;
	                    }
	                    if (d[i] == d[j]) {
	                        count1++;
	                    }
	                }
	            }
	            if (count != count1) {
	                System.out.println("The strings are not anagrams");
	            } else {
	                System.out.println("The strings are anagrams");
	            }
	        }
	    }
	}
