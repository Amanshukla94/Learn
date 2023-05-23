import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Convertarraytoset {


            public static void main(String[] args) {

            	 Integer[] array1 = {555, 444, 555, 666, 444, 555, 666, 444, 5552, 566};
                Set<Integer> set = new HashSet<>(Arrays.asList(array1));

                System.out.println("Set: " + set);
                
                Integer[] array = set.toArray(new Integer[0]);
                System.out.println(Arrays.toString(array));
            }
        }
