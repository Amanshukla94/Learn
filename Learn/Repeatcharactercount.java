
public class Repeatcharactercount {

	public static void main(String[] args) {
		String Text = "I am waiting for my farewell";
		char[] textar = Text.toCharArray();
		int i = 0 , j =0; 
				int count = 0;
		
		for (i= 0;i<Text.length();i++) {
			//System.out.println(textarray[i]);
			
			for (j= i+1;j<Text.length();j++) {
				
				if (textar[i] == textar[j]  && textar[i] != ' ' && textar[j] != ' ' ) {
					count++;
					
					//textar[j]= '0';
				System.out.print(textar[j]+"count is");
				//break; 
				continue;
			}
				}
			
		}
		
		}
	
}