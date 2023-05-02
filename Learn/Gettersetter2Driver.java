import java.util.Scanner;
public class Gettersetter2Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println	("enter the marks");
    Scanner sc = new Scanner(System.in);
    Gettersetter2.setmarks(sc.nextInt());
     System.out.println	("the marks are"+ Gettersetter2.getmarks());
     
     System.out.println	("enter the totalmarks");

     Gettersetter2.settotalmarks(sc.nextInt());
      System.out.println	("the marks are"+ Gettersetter2.gettotalmarks());
      
      System.out.println	("enter the profilequote");
      Gettersetter2.setprofilequote(sc.next());
       System.out.println	("the profilequote is"+ Gettersetter2.getprofilequote());
       
       System.out.println	("enter the name");
       Gettersetter2.setname(sc.next());
        System.out.println	("the name is"+ Gettersetter2.getname());
	}

}
