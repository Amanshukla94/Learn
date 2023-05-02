

public class Primeandcomposite{
    public static void Primeno() {
        int[] arr = {20, 30, 33, 19, 17, 37, 49, 52};
        int [] arr2 = new int[arr.length];
        int [] arr3 = new int[arr.length];
       int  resultant[]  = new int[arr.length];
        int j =0,k =0,p =0,n =0;
        
     
        for (int i=0;i<arr.length;i++) {
        	
        	if ((arr[i]%2==0)|| (arr[i]%3==0)||(arr[i]%5==0)||(arr[i]%7==0) ){
        		arr2[j] = arr[i];
        		j++;
        	}
        	else {
        		arr3[k]= arr[i];
        		k++;
        	}
        }
        for (int m =0;m<arr.length;m++) {
        	 
       // System.out.println(arr3[m]);	
        }int j1 =0;
        for ( n =0;n<arr.length;n++ ) {
        	if (n%2==0 ) { 
        		resultant[n] = arr2[j1];
        		j1++;
        		
        	}else if (arr3[p]!=0){
        		resultant[n] = arr3[p];
        		p++;
        	} 
        		
        	
        	//System.out.println(resultant[n]);
        }
        
      
        
        
        for (int r =0;r<arr.length;r++) {
        	if (resultant[r]== 0) {
        		resultant[r]= 52;
        	}
        	System.out.println(resultant[r]);
        	
        	
        }
        
    }public static void main(String[] args) {
    	Primeno();
}
}