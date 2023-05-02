import java.util.Scanner;
public class Employeedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E1 = new Employee();
System.out.println("enter the salary ");
Scanner sc = new Scanner(System.in);
 E1.setsalary(sc.nextInt());
 E1.getsalary();
	}

}
