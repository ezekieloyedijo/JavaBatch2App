package filehandling.ioexamples.textfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

    public void writeFile(String filePath, String content) {

        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter(filePath))
        ) {

            writer.write(content);

            System.out.println("Text written successfully.");

        } catch (IOException e) {

            System.out.println("Error writing to text file.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
