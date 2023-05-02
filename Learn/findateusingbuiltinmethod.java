import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class findateusingbuiltinmethod {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("enter the date");
		Scanner SC = new Scanner(System.in);
		 String inputDate = SC.nextLine();
		  SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		  Date dt1 = format1.parse(inputDate);
		  SimpleDateFormat format2 = new SimpleDateFormat("EEEE"); 
		  String finalDay = format2.format(dt1);
		  
		  System.out.println(finalDay);
	}

}
