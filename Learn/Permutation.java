public class Permutation {  

  
     // Function to print all the permutations of str
     static void printPermutn(String str, String ans)
     {
  
         // If string is empty
         if (str.length() == 0) {
            System.out.print(ans + " ");
             return;
         }
  
         for (int i = 0; i < str.length(); i++) {
  
             // ith character of str
             char ch = str.charAt(i);//a,c,c
  
            
             String ros = str.substring(0, i) +
                         str.substring(i + 1); //bc,ba,ba
            
             printPermutn(ros, ans + ch); //bca,bac,
             System.out.println(ros);
            
         }
     }
  
     // Driver code
     public static void main(String[] args)
     {
         String s = "abc";
         printPermutn(s, "");
     }
 }