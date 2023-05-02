
public class ArraylistDigitdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = {12,22,42,82,66,77,13};

		for (int i=0;i<num.length;i++) {
			
				
			if (	((num[i]%10)-(num[i]/10))!=0) {
				System.out.println(num[i]);
			}
			
		}
	}

}
