import java.util.Arrays;
import java.util.Scanner;
public class Largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
 System.out.println("enter the number of arrays to print ");
 int arrayno = sc.nextInt();
 int i=0, j =0;
 
 int[] arrays  = new int[arrayno];
 int[] newarray  = new int[arrayno];
 
 System.out.println("enter the numbers sequentially ");
 for (i =0;i<arrayno;i++) {
	
	arrays[i]  = sc.nextInt();
	
 }
 Arrays.sort(arrays);
 for (i =arrays.length-1;i>=arrays.length-3;i--) {
		
	newarray[j] =arrays[i];
		System.out.println("Largest three contenders are"+newarray[j]);
	
 }
 //System.out.println(arrays[i]);
	}

	}