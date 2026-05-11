package filehandling.nioexamples.textfile;

import java.util.List;

public class NIOTextFileApp {

    public static void main(String[] args) {

        String sourceFile = "students.txt";
        String destinationFile = "backup.txt";

        NIOTextFileReader reader =
                new NIOTextFileReader();

        List<String> lines =
                reader.readFile(sourceFile);

        NIOTextFileWriter writer =
                new NIOTextFileWriter();

        writer.writeFile(destinationFile, lines);

        System.out.println("NIO text copy completed.");
    }
}
