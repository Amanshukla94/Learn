import java.util.Arrays;

public class Codility2 {

	public static void Algo() {
	
	//int number = new int[N];
	int number[] = {-1,-52,-652,-555,-525,10,520,12,11,2,46646,22,336,29};
	Arrays.sort(number);
	for (int i=0;i<number.length;i++) {
		if ((number[i]>0)&&(number[i+1]-number[i]!=1  )){
			System.out.println(number[i]);
			break;
		}
	
		
	}}
	public static void main(String[] args) {
		Algo();
		
	}
}

