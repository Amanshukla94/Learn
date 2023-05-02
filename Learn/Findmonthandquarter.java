import java.util.Scanner;

public class Findmonthandquarter {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
			Scanner SC = new Scanner(System.in);
			System.out.println("enter the date");
				int date = SC.nextInt();
				System.out.println("enter the month");
				int month = SC.nextInt();
				System.out.println("enter the year");
				int year = SC.nextInt();
				int[] monthnumber = {1,2,3,4,5,6,7,8,9,10,11,12};
				int[] normalyearmonths = {31,28,31,30,31,30,31,31,30,31,30,31};
				int[] leapyearmonths = {31,29,31,30,31,30,31,31,30,31,30,31};
				int sum = 0,totaldays =0,count =0, finale =0;;
				System.out.println("entered is :"+date+"/" + month+"/"+year);
				int requireddate = 0;
				
				
			
					
					if (month == 1||month == 2||month == 3) {
						
						System.out.println("The month belongs to first quarter");
					}
				else if(month == 4||month == 5||month == 6) {
					System.out.println("The month belongs to second quarter");
					
				}else if (month == 7||month == 8||month == 9) {
					System.out.println("The month belongs to third quarter");}
					
				else {
					System.out.println("The month belongs to fourth quarter");
				}
				for (int m =2023;m  <=year;m++) {
					if (m%4==0) {
						count++;
						System.out.println(count);
					}
				}
					
					
			
					
				if (year >2023 & year%4==0)
				{for(int k= 0;k<month-1;k++) {
					
					
					sum = sum+leapyearmonths[k];
					
					
					
					}	
					totaldays = (year-2023)*365+sum;
					 finale = totaldays+date+count;
					System.out.println(">>>>>>>>>>"+finale );
					
			}
				else {
				for(int j= 0;j<month-1;j++) {
					
					
					sum = sum+normalyearmonths[j];
					
					//System.out.println(sum);
					}	totaldays = (year-2023)*365+sum;
					finale = totaldays+date+count;
					System.out.println(">>>>>>>>>>"+finale);
				
					}
				
					
				requireddate   = finale %7 ; 
					switch(requireddate){
					case 0: System.out.println("Saturday");
					break;
					case 1: System.out.println("Sunday");
					break;
					case 2: System.out.println("monday");
					break;
					case 3: System.out.println("tuesday");
					break;
					case 4: System.out.println("wednesday");
					break;
					case 5: System.out.println("thursday");
					break;
					case 6: System.out.println("friday");
					break;
					
						
						
						
						
						
			}}
			
		}



