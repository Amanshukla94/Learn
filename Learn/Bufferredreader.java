import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferredreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("BCL issues.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    @SuppressWarnings("unused")
			String everything = sb.toString();
		} finally {
		    br.close();
		}
	}

}
