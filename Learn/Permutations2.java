public class Permutations2 {

    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length();

        // Generate permutations using nested for loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                	 for (int l = 0; l < n; l++) {
                    if (i != j && i != k && j != k&& i != l) {
                        System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k)+ + s.charAt(l));
                    }
                }
            }
        }
    }
}}
