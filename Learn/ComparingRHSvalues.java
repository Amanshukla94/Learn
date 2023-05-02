
public class ComparingRHSvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output [82,25,19]
		int j= 0, k=1,i =0;
int num[] = {47,35,82,25,10,7,19};
int created[] = new int[num.length];
for (i=num.length-1;i>=0;i--)
{ 
	for (k=num.length-2;k>=0;k--) {
	if (num[i]>num[k]) {
		created[j] =   num[i];
	System.out.println(created[j]);
	j++;
	
}
	
}
	}}}


