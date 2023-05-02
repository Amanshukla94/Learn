import java.util.Scanner;
public class Pallindromicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the number");
		int a = SC.nextInt();
		int b =a;
		int count =0;
		int t=0; 
	
		
		for (a++;a!=0 ;count++) {
			a= a/10;
		
				
		}
		int k  =1;
		for(int m=1;m<count;m++) {
			k =k*10;
			} 
		System.out.println(k);
		
		
		System.out.println(count);
//int a = 464646464;
int j =0;
int y=0;
int sum =0;
for (int i=k;i>0;i=i/10)
{

	
	   
	y=a%10*i;

	sum = sum+y;
	a=a/10; 
	
	}
System.out.println(sum);
if (sum == b) {
System.out.println("The number is pallindrome");
	}
else{
	System.out.println("The number is not  pallindrome");	
}}

	

}
