import java.util.Arrays;

public class ChatgptArrayprogram {
    public static void main(String[] args) {
        String[] inputArray = {"a1", "a3", "a4", "a6", "a2", "a5"};
        String[] outputArray = new String[inputArray.length];
        int outputIndex = 0;
Arrays.sort(inputArray) ;
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                outputArray[outputIndex++] = inputArray[i];
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 != 0) {
                outputArray[outputIndex++] = inputArray[i];
            }
        }

        System.out.println(Arrays.toString(outputArray));
    }
}