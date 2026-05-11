package filehandling.ioexamples.imagefile;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileWriter {

    public void writeImage(String imagePath, byte[] data) {

        try (
                BufferedOutputStream output =
                        new BufferedOutputStream(
                                new FileOutputStream(imagePath))
        ) {

            output.write(data);

            output.flush();

            System.out.println("Image written successfully.");

        } catch (IOException e) {

            System.out.println("Error writing image file.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
