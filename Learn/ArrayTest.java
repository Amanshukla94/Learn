
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int test[] = new int[5];
     test[0] = 52;
     test[2] = 502;
     test[3] = 512;
     test[4] = 552;
     test[1] = 562;
     
     System.out.println(test[2]);
     int i;
     for (i=0;i<test.length;i++)
     {
    	 System.out.println(test[i]);
     }
	}

}
