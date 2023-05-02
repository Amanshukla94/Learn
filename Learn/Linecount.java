import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Linecount {
    public static void main(String[] args) throws IOException {
        String fileName = "Linecount.txt";
        Path filePath = Paths.get(fileName);
        long lineCount = Files.lines(filePath).count();
        System.out.println("Number of lines in " + fileName + " is " + lineCount);
    }
}

