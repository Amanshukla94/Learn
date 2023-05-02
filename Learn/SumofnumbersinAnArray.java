import java.util.Scanner;
public class SumofnumbersinAnArray {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("enter the number of arrays ");
		int y=0, X=0;
		int i = SC.nextInt();
		int[] num = new int[i];
		System.out.println("enter arrays ");
		for ( i = 0;num.length>i;i++){
			num [i]= SC.nextInt();
			//System.out.println(num[i]);
		}
		if (i%2==0) {
			for (i=0; i<num.length/2;i++) {
				y=num[i]+y;
				
			}
			for (i=num.length/2; i<num.length;i++) {
				X=num[i]+X;
				
			}
			System.out.println("Sum of X = "+X);
			System.out.println("Sum of Y ="+y);
			
			if (X==y){
				System.out.println("Sum is Equal");
				
			}
			else {
				System.out.println("Sum is not Equal");
			}
		}
		if (i%2!=0) {
			for (i=0; i<=num.length/2;i++) {
				y=num[i]+y;
				
			}
			for (i=(num.length/2)+1; i<num.length;i++) {
				X=num[i]+X;
				
			}
			int middlenumber = (i/2)+1;
			i = middlenumber;
			System.out.println("Sum of X = "+X);
			System.out.println("Sum of Y ="+y);
			System.out.println(num[i-1]);
			if ((X+num[i-1])==y){
				System.out.println("Sum is Equal");
				
			}
			else {
				System.out.println("Sum is not Equal");
			}
		}
		
			
		}



	}


