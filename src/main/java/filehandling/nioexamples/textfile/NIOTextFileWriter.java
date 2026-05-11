package filehandling.nioexamples.textfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NIOTextFileWriter {

    public void writeFile(String filePath, List<String> lines) {

        try {

            Path path = Path.of(filePath);

            Files.write(path, lines);

            System.out.println("NIO file write successful.");

        } catch (IOException e) {

            System.out.println("Error writing NIO file.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}