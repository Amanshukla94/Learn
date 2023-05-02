
public class Practise12 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
int i ;
		for (i=1;i<=5;i++)
		{
			try {
			System.out.println("My name is AMan Shukla");
			Thread.sleep(3000);
		}
			catch(InterruptedException IE)
			{
				System.out.println("Exception handled");
				}
			}
	}

}
