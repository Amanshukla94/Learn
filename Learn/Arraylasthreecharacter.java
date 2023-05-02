
public class Arraylasthreecharacter {

	public static void main(String[] args) {
long out=0;		// TODO Auto-generated method stub
long res=0;
long test [] = new long [5];
 test [0] = 4454464665l;

 for (long i=test[0];res<1000;) {
	 res= i%1000;
	 System.out.println(res);
	 
	 break;
 }
 for (long j=test[0];out <1000;out++) {
	 out = j/1000000;
	j= out;
	System.out.println(out); 
	if (j>100) {
		System.out.println(j/10);
	}
 }
	}}


