public class DuplicatecharacterinString {
	public static void main(String args[]) {
		int count = 0;
	      String str = "I am waiting for my farewell";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) { 
	            	count ++;
	               System.out.print(carray[j] + " ");
	               
	               break;
	            }
	         }
	      }
	   }
	}