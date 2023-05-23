
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Readjsonfile {

    public static void main(String[] args) throws JsonProcessingException, IOException {

        // Read JSON data from file
        String jsonData = new String(Files.readAllBytes(Paths.get("./Resources/Test.json")));

        // Remove special characters
        jsonData = jsonData.replaceAll("[@#\\$%]", "a");

        // Parse JSON data
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonData);

        // Print JSON data
        System.out.println(jsonNode);
    }

}
