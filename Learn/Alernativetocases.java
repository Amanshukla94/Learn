import java.util.Scanner;
public class Alernativetocases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Executiveid[] = {1,2,3,4,5,6,7,8,9,10};
Scanner SC =new Scanner(System.in);	
int id = SC.nextInt();

try {
for (int i =0;i<=Executiveid.length;i++)
{
	
if (id ==Executiveid[i]) {
	System.out.println(Executiveid[i]);
}


}}
catch(Exception E) {
	System.out.println("Executive details are not present");
	
}
		
	}

}
