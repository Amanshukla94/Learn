
public class Calculator

{
	 static int a = 10 ;
	 static int b = 30 ;
public static int cal(int a, int b)
{
int add = a+b;
System.out.println(add);
 return add;
}
 public static int cal()
 {
 
 int mul = a*b;
 System.out.println(mul);
  return mul;
   
  
}
 public static void main(String[] args)
 {
	 cal(2,4);
	 
	 cal();
	
 }
    
}

