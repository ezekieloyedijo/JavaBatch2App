package filehandling.textfile;

public class App {
    public static void main(String[] args) {
        String source = "student.txt";
        String destinationFile = "backup.txt";

        TextFileReader reader  = new TextFileReader();
        String content = reader.readFile(source);
        TextFileWriter writer = new TextFileWriter();
        writer.writeFile(destinationFile,content);
        System.out.println("File copy operation completed");

    }
}
