
public class Employee {

	private int salary;
	
	public void setsalary(int salary)
	{
	 this.salary = salary;
	 
	 if (salary>10000)
	 {
		 System.out.println("the salary is"+salary);
	 }
	 else {
		 System.out.println("the salary is  zero so it can not be printed");
	 }
}
	
	public int getsalary() {
		return salary;
	}
	}
