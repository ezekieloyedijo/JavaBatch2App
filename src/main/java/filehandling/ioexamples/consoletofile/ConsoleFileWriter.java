package filehandling.ioexamples.consoletofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleFileWriter {

    public void saveDetails(String filePath, String details) {

        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter(filePath, true))
        ) {

            writer.write(details);

            writer.write("--------------------");

            writer.newLine();

            System.out.println("Student details saved.");

        } catch (IOException e) {

            System.out.println("Error saving student details.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}