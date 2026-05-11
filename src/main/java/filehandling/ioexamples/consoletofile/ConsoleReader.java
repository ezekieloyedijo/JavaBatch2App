package filehandling.ioexamples.consoletofile;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    public String readStudentDetails() {

        StringBuilder details = new StringBuilder();

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(System.in))
        ) {

            System.out.print("Enter student name: ");
            String name = reader.readLine();

            System.out.print("Enter student email: ");
            String email = reader.readLine();

            details.append("Name: ")
                    .append(name)
                    .append(System.lineSeparator());

            details.append("Email: ")
                    .append(email)
                    .append(System.lineSeparator());

        } catch (IOException e) {

            System.out.println("Error reading console input.");
            System.out.println("Reason: " + e.getMessage());
        }

        return details.toString();
    }
}
