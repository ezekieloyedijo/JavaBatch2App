package filehandling.nioexamples.textfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NIOTextFileReader {

    public List<String> readFile(String filePath) {

        List<String> lines = List.of();

        try {

            Path path = Path.of(filePath);

            lines = Files.readAllLines(path);

        } catch (IOException e) {

            System.out.println("Error reading file using NIO.");
            System.out.println("Reason: " + e.getMessage());
        }

        return lines;
    }
}
