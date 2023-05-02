import java.util.Arrays;

public class Regex {

	
	    public static void main(String[] args) {
	        String[] array1 = {"478$2","875@1","017||3","2456$|$$","3745@2!"};
	        String[] array2 = new String[array1.length];
	        String[] array3 = new String[array1.length];
	       
	        String regex = "[^a-zA-Z0-9]"; // regex to match all non-alphanumeric characters
	        String regex2 = "[0-9]";
	        int i = 0, m = 0;
	        for (i = 0; i < array1.length; i++) {
	            array2[i] = array1[i].replaceAll(regex, ""); 
	            array3[i] = array1[i].replaceAll(regex2, "");// remove special characters from string
	        }
	       
	      
	        
	        // print original and modified arrays
	        System.out.println("Original array:");
	        System.out.println(Arrays.toString(array1));
	        System.out.println("Modified array:");
	        System.out.println(Arrays.toString(array2));
	        System.out.println(Arrays.toString(array3));
	       
	        
	    }
	}
