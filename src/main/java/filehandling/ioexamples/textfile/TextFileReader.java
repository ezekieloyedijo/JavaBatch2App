package filehandling.ioexamples.textfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

    public String readFile(String filePath) {

        StringBuilder content = new StringBuilder();

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new FileReader(filePath))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {
                // This adds the line into content.
                content.append(line)
                        .append(System.lineSeparator()); // preserves line break
            }

        } catch (IOException e) {

            System.out.println("Error reading text file.");
            System.out.println("Reason: " + e.getMessage());
        }

        return content.toString();
    }
}
