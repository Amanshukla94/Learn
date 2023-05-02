import java.util.Scanner;
public class IP{
 public static void main(String[] args)
 {
 Scanner SC =new Scanner(System.in);
 String A =SC.nextLine();
 String B =SC.nextLine();
 String C =SC.nextLine();
 String D =SC.nextLine();
 
 
 if (A.length() >3 ||B.length() >3 ||C.length()>3||D.length()>3){

	 System.exit(0);
 
 }
 else {
 System.out.println("The IP is "+A+"."+B+"."+C+"."+D);
 }
 }}