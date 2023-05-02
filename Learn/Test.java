
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"A", "B", "C", "A", "C", "E"};
		int n = array1.length;

		for (int i = 0; i < n; i++) {
		    for (int j = i + 1; j < n; j++) {
		        if (array1[i].equals(array1[j])) {
		            for (int k = j; k < n - 1; k++) {
		                array1[k] = array1[k + 1];
		            }
		            n--;
		            j--;
		        }
		    }
		}

		// Print the updated array
		for (int i = 0; i < n; i++) {
		    System.out.print(array1[i] + " ");
		}

	}

}
