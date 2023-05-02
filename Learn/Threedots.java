
public class Threedots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array1[]= {"aman","shuklaman", "Productgretarthaneightcharacters"};
		String array2[]= {"go with the flow", "eliminattheproductwithspaces", "productshouldbegreaterthaneight"};
		int j= 0;
	int count = 0;
		int fal = array1.length;
		int sal = array2.length;
		
		String resultant[] = new String[fal + sal];
		 System.arraycopy(array1,0,resultant,0, fal);
		 System.arraycopy(array2,0,resultant,fal, sal);
		
		 for (int i=0;i<resultant.length;i++)
		 {
			 if (resultant[i].length()>8)
				{
			for ( j =0;j<resultant[i].length();j++) {
			char carray[] = resultant[i].toCharArray();
			if (j>7 ) {
				carray[j]='.';
			}
			if (j>10)
			{
				break;
			}
			
			System.out.println(carray[j]);
			
				
			}
		 }
			
			}
	}

}
