import java.lang.management.GarbageCollectorMXBean;

public class Pallindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 14641,i =14641;
int count =0,sum=0;
int m =10000;
for (int j =input;input >0;) {
	
	input =input/10;
	count++;
	System.out.println(count);
} 
input =i;
for ( i =input;i>1;m=m/10) {
	
	int f =i%10*m;
	i =i/10;
 sum = sum+f;
	
} System.out.println(sum+(i%10));
if(sum+(i%10)==input){
	System.out.println("number is pallindrome");
}
	}

}
