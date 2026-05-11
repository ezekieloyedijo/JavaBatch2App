package filehandling.ioexamples.imagefile;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageFileReader {

    public byte[] readImage(String imagePath) {

        byte[] data = new byte[0];

        try (
                BufferedInputStream input =
                        new BufferedInputStream(
                                new FileInputStream(imagePath))
        ) {

            data = input.readAllBytes();

        } catch (IOException e) {

            System.out.println("Error reading image file.");
            System.out.println("Reason: " + e.getMessage());
        }

        return data;
    }
}
