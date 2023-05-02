import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listtoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a list of strings
        List<String> aList = Arrays.asList("Geeks", "for",
                     "GeeksQuiz", "GeeksforGeeks", "GFG");
  
        Set<String> hSet = new HashSet<String>();
  for (String x : aList) 
// first it will add all strings in set
            hSet.add(x);
  
        System.out.println("Created HashSet is");
        for (String x : hSet)
// it will traverse all the elements of set
            System.out.println(x);
  
           }

	}


