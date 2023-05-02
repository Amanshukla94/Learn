import java.util.Scanner;
public class Restaurantmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO THE RESTAURANT");
		System.out.println("1. Dalfry");
		System.out.println("2. kanda special");
		System.out.println("3.mutton thali");
		System.out.println("4.Dal makhani");
		System.out.println("5. murg musaalm");
		System.out.println("THANKS FOR COMING");
		System.out.println("ENTER YOUR CHOICE");
		
		Scanner sc =  new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{

	case 1:System.out.println("ordered");
	break;
	case 2:System.out.println("reached");
	break;
	case 3:System.out.println("on the way");
	break;
	case 4:System.out.println("tasty");
	break;
	case 5:System.out.println("once more");
	break;
	default: System.out.println("get out");
	
	}

}
}
