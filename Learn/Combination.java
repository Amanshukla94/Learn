import java.util.Arrays;
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        System.out.println("Enter the number limit:");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int array1[] = new int[j];
        int n = 0;
        int array2[] = new int[j];

        System.out.println("Enter the numbers quantity:");
        for (int i = 0; i < j; i++) {
            array1[i] = sc.nextInt();
        }
int x  = 1,y  = 2;
        for (int i = 0; i < j; i++) {
            for (int m = 1; m < array1.length - 1;m++) {
                if (array1[i] == array1[m] + array1[m + x]) {
                    array2[n] = array1[m];
                    n++;
                    array2[n] = array1[m+x];
                    n++;
                }else if (array1[i] == array1[m] + array1[m + x]+array1[m+y]) {
                	 array2[n] = array1[m];
                     n++;
                     array2[n] = array1[m+x];
                     n++;
                     array2[n] = array1[m+y];
                     n++;
             
                }
            }
        }

        System.out.println("The elements in array2 are:");
        System.out.println(Arrays.toString(array2));
       /* for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }*/
    }
}