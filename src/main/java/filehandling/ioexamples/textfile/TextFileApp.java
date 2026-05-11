package filehandling.ioexamples.textfile;


public class TextFileApp {

    public static void main(String[] args) {

        String sourceFile = "students.txt";
        String destinationFile = "backup.txt";

        TextFileReader reader = new TextFileReader();

        String content = reader.readFile(sourceFile);

        TextFileWriter writer = new TextFileWriter();

        writer.writeFile(destinationFile, content);

        System.out.println("File copy operation completed.");
    }
}
