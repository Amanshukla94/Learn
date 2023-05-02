import java.util.Scanner;
public class Findcalendardate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		int date = SC.nextInt();
		int month = SC.nextInt();
		int year = SC.nextInt();
	
		System.out.println("currentdate is :"+date+"/" + month+"/"+year);
		
		int inputmonth = SC.nextInt(); 
		
		
		int obtainedmonth=inputmonth%12;
		int requiredmonth = month +obtainedmonth;
		
		int findleapyear = ((month/12)+year)/4;
		
			
		}/* sunday  Remainder 1
		monday   Remainder 2
		tuesday   Remainder 3
		wednesday  Remainder 4
		thursday  Remainder 5
		friday   Remainder 6
		saturday   Remainder 0
		
		number of months % 12 = (Remainder will be the months )
		122/12= 10(added to years), Remainder will be 2 and it will be added to months.
		*/
		

	}


