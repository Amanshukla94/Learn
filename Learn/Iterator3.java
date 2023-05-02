import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
public class Iterator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter the number of your favourite fruits");
Scanner SC = new Scanner (System.in);
int num = SC.nextInt();
System.out.println("ENter the name of your different fruits");
ArrayList <String> AR = new ArrayList<String>();

for (int i=0;i> num; i++) {
	
	AR.add(SC.nextLine());
}Iterator i = AR.iterator();
while (i.hasNext()) {
	String str =(String).next();
	System.out.println("name" +str+str.length());
}
	}
	

}
