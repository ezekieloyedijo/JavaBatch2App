package filehandling.consoletofile;

public class ConsoleApp {
    public static void main(String[] args) {
        String filePath = "console-message.txt";

        ConsoleReader reader = new ConsoleReader();

        String details = reader.readStudentDetails();

        ConsoleFileWriter writer = new ConsoleFileWriter();

        writer.saveDetails(filePath, details);

        System.out.println("Console to file operation completed.");


    }
}
